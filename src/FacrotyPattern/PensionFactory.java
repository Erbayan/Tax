package FacrotyPattern;

import StrategyPattern.PensionTaxStrategy;
import StrategyPattern.TaxStrategy;

public class PensionFactory implements TaxStrategyFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new PensionTaxStrategy();
    }
}
