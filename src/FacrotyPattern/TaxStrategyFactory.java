package FacrotyPattern;

import StrategyPattern.TaxStrategy;

public interface TaxStrategyFactory {
    TaxStrategy createTaxStrategy();
}
