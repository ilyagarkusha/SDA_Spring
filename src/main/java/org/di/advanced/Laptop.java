package org.di.advanced;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Product {
    CalculationService service;


    @Autowired
    public Laptop(
            @Qualifier("vatCalculationService")
            CalculationService service) {
        this.service = service;
    }

    @Override
    public void purchases() {

        System.out.println("Purchasing a Laptop");
        service.calculate();
    }
}
