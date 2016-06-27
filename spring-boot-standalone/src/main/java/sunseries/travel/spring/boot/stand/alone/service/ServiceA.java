package sunseries.travel.spring.boot.stand.alone.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceA {
    private static Logger log = LoggerFactory.getLogger(ServiceA.class);

    @Autowired
    private BeanA beanA;

    public String getName() {
        log.debug("Logging from Service A for : " );
        beanA.printName();
        return "ServiceA";
    }
}
