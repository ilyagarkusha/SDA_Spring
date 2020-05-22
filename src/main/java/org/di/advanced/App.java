package org.di.advanced;

import org.di.basics.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        /*Bike aBike = new Bike();
        Laptop aLaptop = new Laptop();

        CalculationService service = new TaxCalculationService(aBike,aLaptop);  //adding dependencies to service
        service.calculate();*/

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        //CalculationService contextRetrievedService = ctx.getBean(CalculationService.class);

        /*// Setter Injection
        Bike aBike = new Bike();
        aBike.setService(contextRetrievedService);
        aBike.purchases();*/

        // Constructor Injection
        Bike aBike = ctx.getBean(Bike.class);
        aBike.purchases();


        Laptop aLaptop = ctx.getBean(Laptop.class);
        aLaptop.purchases();
        


        // Field Injection
    }
}
