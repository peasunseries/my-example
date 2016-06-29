package com.zengcode;

import com.couchbase.client.java.query.N1qlQueryResult;
import com.couchbase.client.java.query.N1qlQueryRow;
import com.zengcode.repos.AdvertRepository;
import com.zengcode.repos.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    private static Logger log = LoggerFactory.getLogger(Application.class.getName());

    @Autowired
    private AdvertRepository repository;

    @Autowired
    private MyService myService;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        Application application = ctx.getBean(Application.class);
        System.out.println("===============>>>> Hello1 : " + application.repository.findOne("advert::0086bc11-2c57-476b-a618-6730555f985f"));
        //System.out.println("===============>>>> Hello2 : " + application.repository.findAll(new PageRequest(0, 10)));
        System.out.println("===============>>>> Hello3 : " + application.myService.findByName2());

        N1qlQueryResult queryResult = application.myService.findByName();
        for (N1qlQueryRow n1qlQueryRow : queryResult) {
            System.out.println(n1qlQueryRow.toString());
        }
    }
}
