package org.di.basics;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HelloWorld {
    private String message;
    List<Holiday> holidays;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public void hello(){
        System.out.println("hello from HelloWorld bean: " + message);
    }

    public void setHolidays(List holidays) {
        this.holidays = holidays;
    }

    public List<Holiday> getHolidays() {
        return holidays;
    }
}
