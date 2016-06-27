package com.zengcode;

import com.zengcode.service.MyService;
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
    private MyService myService;

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
        Application application = ctx.getBean(Application.class);
        log.info("Hello : " + application.myService.getServiceName());
    }
}
