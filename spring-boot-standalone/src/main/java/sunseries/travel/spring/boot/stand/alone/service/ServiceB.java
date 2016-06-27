package sunseries.travel.spring.boot.stand.alone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.ConnectException;

@Service
public class ServiceB {

    @Autowired
    private ServiceA serviceA;

    @Autowired
    private Config config;

    public void run() {
        System.out.println("Hello : " + serviceA.getName() + " : " + config.getUsername());
    }

}
