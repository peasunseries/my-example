package com.zengcode.configuration;

import com.zengcode.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"dev", "staging"})

public class DevConfiguration {

    @Bean
    public MyService myService() {
        return new MyService("I am development service.");
    }
}
