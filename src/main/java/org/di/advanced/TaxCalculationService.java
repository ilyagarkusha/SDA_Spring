package org.di.advanced;

import org.springframework.stereotype.Service;

@Service  //@Component
public class TaxCalculationService implements CalculationService{
    private Bike theBike;
    private Laptop theLaptop;
    private Product product;

    public TaxCalculationService(Product product) {
        this.product = product;
    }

    @Override
    public void calculate() {
        System.out.println("Calculating the tax for bike and laptop");
    }

    public TaxCalculationService(Bike theBike, Laptop theLaptop) {
        this.theBike = theBike;
        this.theLaptop = theLaptop;
    }

    public TaxCalculationService() {
    }

    public Bike getTheBike() {
        return theBike;
    }

    public void setTheBike(Bike theBike) {
        this.theBike = theBike;
    }

    public Laptop getTheLaptop() {
        return theLaptop;
    }

    public void setTheLaptop(Laptop theLaptop) {
        this.theLaptop = theLaptop;
    }
}
