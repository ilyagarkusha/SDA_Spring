package org.di.homework.task3.config;

import org.di.homework.task3.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config1 {
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public Coach tennisCoah() {
        return new TennisCoach(sadFortuneService());
    }

}
