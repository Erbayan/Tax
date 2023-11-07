package AdapterPattern;

import StrategyPattern.TaxStrategy;

public class OldTaxSystemAdapter implements TaxStrategy {
    private OldTaxSystem oldTaxSystem;

    public OldTaxSystemAdapter(OldTaxSystem oldTaxSystem) {
        this.oldTaxSystem = oldTaxSystem;
    }

    @Override
    public double calculateTax(double income) {
        return oldTaxSystem.calculateOldTax(income);
    }
}
