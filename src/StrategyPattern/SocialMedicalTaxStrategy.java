package StrategyPattern;

import StrategyPattern.TaxStrategy;

public class SocialMedicalTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return 4900;
    }
}
