package org.di.basics.config;

import org.di.basics.HelloWorld;
import org.di.basics.Holiday;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
@ComponentScan(value = "org.di")
public class AppConfig {
    @Bean
    @Qualifier("firstBean")
    public Holiday christmas() {
        Holiday theChristmas = new Holiday();
        theChristmas.setGreeting("happy New Year");
        theChristmas.setMonth(5);
        theChristmas.setDay(17);
        return theChristmas;
    }

    @Bean
    @Qualifier("secondBean")
    public Holiday Madisepaev() {
        Holiday theChristmas = new Holiday();
        theChristmas.setGreeting("Happy Madisepaev");
        theChristmas.setMonth(2);
        theChristmas.setDay(24);
        return theChristmas;
    }

    @Bean
    public HelloWorld helloWorld(List<Holiday> holidayList) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("This is a message from HelloWorld bean");
        helloWorld.setHolidays(holidayList);
        return helloWorld;
    }
}
