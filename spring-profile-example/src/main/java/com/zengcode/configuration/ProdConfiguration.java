package com.zengcode.configuration;

import com.zengcode.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfiguration {

    @Bean
    public MyService myService() {
        return new MyService("I am production service.");
    }
}
