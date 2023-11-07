package DecoratorPattern;

import DecoratorPattern.PersonStatus;
import ObserverPattern.TaxObserver;
import StrategyPattern.TaxStrategy;

public class Mother implements PersonStatus, TaxObserver {
    @Override
    public double calculateTax(double income) {
        // Многодетная мать платит обязательные пенсионные взносы и социальные отчисления
        return 0;
    }

    @Override
    public void update(TaxStrategy taxStrategy) {
        System.out.println("Mother received tax strategy update.");
    }
}
