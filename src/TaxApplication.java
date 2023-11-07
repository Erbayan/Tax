import java.util.ArrayList;
import java.util.List;

public class TaxApplication {
    private static TaxApplication instance;
    private TaxStrategyManager taxStrategyManager;
    private List<TaxObserver> taxObservers;

    private TaxApplication() {
        // Инициализация налоговых компонентов
        TaxStrategy initialTaxStrategy = new PensionTaxStrategy();
        taxStrategyManager = new TaxStrategyManager(initialTaxStrategy);
        taxObservers = new ArrayList<>();
    }

    public static TaxApplication getInstance() {
        if (instance == null) {
            instance = new TaxApplication();
        }
        return instance;
    }

    public TaxStrategyManager getTaxStrategyManager() {
        return taxStrategyManager;
    }

    public void addObserver(TaxObserver observer) {
        taxObservers.add(observer);
    }

    public void removeObserver(TaxObserver observer) {
        taxObservers.remove(observer);
    }

    public void notifyObservers() {
        TaxStrategy currentTaxStrategy = taxStrategyManager.getTaxStrategy();
        for (TaxObserver observer : taxObservers) {
            observer.update(currentTaxStrategy);
        }
    }
}
