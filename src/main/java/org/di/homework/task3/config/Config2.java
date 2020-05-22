package org.di.homework.task3.config;

import org.di.homework.task3.Coach;
import org.di.homework.task3.FortuneService;
import org.di.homework.task3.HappyFortuneService;
import org.di.homework.task3.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
    // define bean for our sad fortune service
    @Bean
    public FortuneService HappyFortuneService() {
        return new HappyFortuneService();
    }

    //define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(HappyFortuneService());
    }
}
