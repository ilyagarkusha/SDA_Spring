package org.di.homework.task3;

import org.di.homework.task3.config.Config1;
import org.di.homework.task3.config.Config2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config1.class, Config2.class);

        TennisCoach tennisCoach = context.getBean(TennisCoach.class);
        SwimCoach swimCoach = context.getBean(SwimCoach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyWorkout());
    }
}
