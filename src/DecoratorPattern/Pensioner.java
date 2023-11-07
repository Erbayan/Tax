package DecoratorPattern;

import DecoratorPattern.PersonStatus;
import ObserverPattern.TaxObserver;
import StrategyPattern.TaxStrategy;

public class Pensioner implements PersonStatus, TaxObserver {

    @Override
    public double calculateTax(double income) {
        // Пенсионер не платит налоги
        return 0.0;
    }

    @Override
    public void update(TaxStrategy taxStrategy) {
        System.out.println("Pensioner received tax strategy update.");
    }
}
