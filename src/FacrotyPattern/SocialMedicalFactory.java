package FacrotyPattern;

import StrategyPattern.SocialMedicalTaxStrategy;
import StrategyPattern.TaxStrategy;

public class SocialMedicalFactory implements TaxStrategyFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new SocialMedicalTaxStrategy();
    }
}
