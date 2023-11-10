package FactoryPattern;

import StrategyPattern.TaxStrategy;

public interface TaxFactory {
    TaxStrategy createTaxStrategy();
}
