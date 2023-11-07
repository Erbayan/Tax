public class SocialMedicalTaxStrategyFactory implements TaxStrategyFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new SocialMedicalTaxStrategy();
    }
}
