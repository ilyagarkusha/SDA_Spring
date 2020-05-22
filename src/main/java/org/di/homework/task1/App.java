package org.di.homework.task1;

import org.di.homework.task1.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Battery battery = context.getBean(Battery.class);
        Disc disc = context.getBean(Disc.class);
        System.out.println("Battery name: " + battery.getName() + "\n" +
                "Battery price: " + battery.getPrice() + "$" +"\n" +
                "Battery capacity: " + battery.getCapacity() + "mAh" + "\n");
        System.out.println("Disc name: " + disc.getName() + "\n" +
                "Disc price: " + disc.getPrice() + "$" + "\n" +
                "Disc size: " + disc.getSize()+  "\"");

        battery.deliver();
        context.close();
    }
}
