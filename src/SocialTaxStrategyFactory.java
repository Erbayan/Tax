public class SocialTaxStrategyFactory implements TaxStrategyFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new SocialTaxStrategy();
    }
}
