package sunseries.travel.spring.boot.stand.alone.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyRouter2  extends RouteBuilder {

     @Autowired
     private ProducerTemplate producerTemplate;

    @Override
    public void configure() throws Exception {
        from("timer:foo?delay=2000")
                .process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("Invoked timer at " + new Date());
                    }
                });

        from("timer://simpleTimer?period=5000")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("Timer trigger ");
                        producerTemplate.sendBody("direct:test", "Hello World");
                    }
                });

        from("direct:test")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("==========>>> " + exchange.getIn().getBody());
                    }
                });
    }

}