package ObserverPattern;

import StrategyPattern.TaxStrategy;

public class TaxManager {
    private TaxStrategy taxStrategy;

    public TaxManager(TaxStrategy initialTaxStrategy) {
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
