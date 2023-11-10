package FactoryPattern;

import StrategyPattern.PensionTaxStrategy;
import StrategyPattern.TaxStrategy;

public class PensionFactory implements TaxFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new PensionTaxStrategy();
    }
}
