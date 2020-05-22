package org.di.homework.task1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.di.homework")
@PropertySource("classpath:products.properties")
public class AppConfig {


}
