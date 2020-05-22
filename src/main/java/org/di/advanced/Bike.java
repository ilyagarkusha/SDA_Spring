package org.di.advanced;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bike implements Product, DisposableBean {
    // @Autowired // field injection not recommended
    CalculationService service;

    @PostConstruct
    public void afterConstruct() {
        System.out.println("Bike been is created");
    }


    @Override
    public void purchases() {
        System.out.println("Purchasing a Bike");
        service.calculate();
    }

    @Autowired  // constructor injection
    public Bike(
            @Qualifier("vatCalculationService")
            CalculationService service) {
        this.service = service;
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("The bean is going to destroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy() method is called");
    }

    /*@Autowired //setter injection
    public void setService(CalculationService service) {
        this.service = service;
    }*/
}
