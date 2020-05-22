package org.di.homework.task4;

import org.di.homework.task1.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ShoppingCart {
    private List<Product> shoppingList = new ArrayList<>();

    public void addToCart(Product product) {
        shoppingList.add(product);
    }
}
