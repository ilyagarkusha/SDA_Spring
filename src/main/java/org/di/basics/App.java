package org.di.basics;

import org.di.basics.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld hmFromContext = ctx.getBean(HelloWorld.class);
        hmFromContext.hello();*/

        /*ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hmFromContext = ctx.getBean(HelloWorld.class);
        hmFromContext.hello();
        System.out.println(hmFromContext.getHolidays().get(1).getGreeting());*/

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hmFromContext = ctx.getBean(HelloWorld.class);
        hmFromContext.setMessage("Hammy Holiday");
        hmFromContext.hello();
    }
}
