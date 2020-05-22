package org.di.homework.task2;


import org.springframework.stereotype.Service;

@Service
public class ExpressDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Express Delivery");
    }
}
