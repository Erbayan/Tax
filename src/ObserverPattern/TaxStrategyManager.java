package ObserverPattern;

import StrategyPattern.TaxStrategy;

public class TaxStrategyManager {
    private TaxStrategy taxStrategy;

    public TaxStrategyManager(TaxStrategy initialTaxStrategy) {
        this.taxStrategy = initialTaxStrategy;
    }

    public void changeTaxStrategy(TaxStrategy newTaxStrategy) {
        this.taxStrategy = newTaxStrategy;
    }

    public double calculateTax(double income) {
        return taxStrategy.calculateTax(income);
    }

    public void setTaxStrategy(TaxStrategy newTaxStrategy) {
        changeTaxStrategy(newTaxStrategy);
    }

    public TaxStrategy getTaxStrategy() {
        return taxStrategy;
    }
}
