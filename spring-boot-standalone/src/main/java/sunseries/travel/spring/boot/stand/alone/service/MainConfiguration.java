package sunseries.travel.spring.boot.stand.alone.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean
    BeanA beanA(@Value("${config.name}") String name) {
        BeanA beanA = new BeanA();
        beanA.setName(name);
        return beanA;
    }
}
