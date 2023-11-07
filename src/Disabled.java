public class Disabled implements PersonStatus, TaxObserver {
    @Override
    public double calculateTax(double income) {
        // Инвалид платит только социальные отчисления
        return 0;
    }

    @Override
    public void update(TaxStrategy taxStrategy) {
        System.out.println("Disabled received tax strategy update.");
    }
}
