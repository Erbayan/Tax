package SingletonPattern;

import ObserverPattern.TaxObserver;
import ObserverPattern.TaxManager;
import StrategyPattern.PensionTaxStrategy;
import StrategyPattern.TaxStrategy;

import java.util.ArrayList;
import java.util.List;

public class TaxApplication {
    private static TaxApplication instance;
    private TaxManager taxManager;
    private List<TaxObserver> taxObservers;

    private TaxApplication() {
        TaxStrategy initialTaxStrategy = new PensionTaxStrategy();
        taxManager = new TaxManager(initialTaxStrategy);
        taxObservers = new ArrayList<>();
    }

    public static TaxApplication getInstance() {
        if (instance == null) {
            instance = new TaxApplication();
        }
        return instance;
    }

    public TaxManager getTaxStrategyManager() {
        return taxManager;
    }

    public void addObserver(TaxObserver observer) {
        taxObservers.add(observer);
    }

    public void removeObserver(TaxObserver observer) {
        taxObservers.remove(observer);
    }

    public void notifyObservers() {
        TaxStrategy currentTaxStrategy = taxManager.getTaxStrategy();
        for (TaxObserver observer : taxObservers) {
            observer.update(currentTaxStrategy);
        }
    }
}
