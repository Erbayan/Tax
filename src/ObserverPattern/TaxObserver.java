package ObserverPattern;

import StrategyPattern.TaxStrategy;

public interface TaxObserver {
    void update(TaxStrategy taxStrategy);
}
