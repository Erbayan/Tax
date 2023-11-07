public class PensionTaxStrategyFactory implements TaxStrategyFactory {
    @Override
    public TaxStrategy createTaxStrategy() {
        return new PensionTaxStrategy();
    }
}
