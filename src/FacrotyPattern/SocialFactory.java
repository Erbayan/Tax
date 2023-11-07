package FacrotyPattern;

import StrategyPattern.SocialTaxStrategy;
import StrategyPattern.TaxStrategy;

public class SocialFactory implements TaxStrategyFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new SocialTaxStrategy();
    }
}
