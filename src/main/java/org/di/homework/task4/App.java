package org.di.homework.task4;

import org.di.homework.task1.Battery;
import org.di.homework.task1.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ShoppingCartConfig.class, AppConfig.class);

        ShoppingCart firstUserCart = context.getBean(ShoppingCart.class);
        ShoppingCart secondUserCart = context.getBean(ShoppingCart.class);

        Battery battery = new Battery();

        firstUserCart.addToCart(battery);
        secondUserCart.addToCart(battery);

        System.out.println(firstUserCart.equals(secondUserCart));

    }
}
