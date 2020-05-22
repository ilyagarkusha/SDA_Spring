package org.di.basics;

import org.springframework.stereotype.Component;

@Component
public class Holiday {
    private int month;
    private int day;
    private String greeting;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Holiday() {
    }

    public Holiday(int month, int day, String greeting) {
        this.month = month;
        this.day = day;
        this.greeting = greeting;
    }


}
