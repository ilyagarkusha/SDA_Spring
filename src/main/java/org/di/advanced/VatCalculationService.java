package org.di.advanced;

import org.springframework.stereotype.Service;

@Service
public class VatCalculationService implements CalculationService {
    @Override
    public void calculate() {
        System.out.println("Calculating VAT...");
    }
}
