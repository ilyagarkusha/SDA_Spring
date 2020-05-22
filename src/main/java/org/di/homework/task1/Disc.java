package org.di.homework.task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:products.properties")
public class Disc extends Product {
    @Value("#{new Integer('${disc.size}')}")
    private int size;

    public int getSize() {
        return size;
    }



    @Override
    @Value("${disc.name}")
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    @Value("#{new Double('${disc.price}')}")
    public void setPrice(double price) {
        super.setPrice(price);
    }
}
