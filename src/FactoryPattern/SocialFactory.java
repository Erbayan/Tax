package FactoryPattern;

import StrategyPattern.SocialTaxStrategy;
import StrategyPattern.TaxStrategy;

public class SocialFactory implements TaxFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new SocialTaxStrategy();
    }
}
