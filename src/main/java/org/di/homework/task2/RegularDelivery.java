package org.di.homework.task2;



import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class RegularDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Regular Delivery");
    }
}
