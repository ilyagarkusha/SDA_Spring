package org.di.homework.task1;


import org.di.homework.task2.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:products.properties")
public class Battery extends Product {

    @Value("#{new Integer('${battery.capacity}')}")
    private int capacity;
    private Delivery delivery;

    @Autowired
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void deliver() {
        delivery.deliver();
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    @Value("${battery.name}")
    public void setName( String name) {

        super.setName(name);
    }

    @Override
    @Value("#{new Double('${battery.price}')}")
    public void setPrice(double price) {
        super.setPrice(price);
    }
}
