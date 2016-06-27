package sunseries.travel.spring.boot.stand.alone;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sunseries.travel.spring.boot.stand.alone.service.MyRouter2;
import sunseries.travel.spring.boot.stand.alone.service.ServiceB;

import java.util.Date;

@SpringBootApplication
public class Application {

    private static Logger log = LoggerFactory.getLogger(Application.class.getName());

    private static Main main;

    @Autowired
    public ServiceB serviceB;

    @Autowired
    private MyRouter2 myRouter2;


    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class,
                args);

        Application mainObj = ctx.getBean(Application.class);
        mainObj.serviceB.run();
        main = new Main();
        // add routes
        main.addRouteBuilder(mainObj.myRouter2);
        // run until you terminate the JVM
        System.out.println("Starting Camel. Use ctrl + c to terminate the JVM.\n");
        main.run();
        
        log.debug("Application exited");
    }

}