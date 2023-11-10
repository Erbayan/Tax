package FactoryPattern;

import StrategyPattern.SocialMedicalTaxStrategy;
import StrategyPattern.TaxStrategy;

public class SocialMedicalFactory implements TaxFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new SocialMedicalTaxStrategy();
    }
}
