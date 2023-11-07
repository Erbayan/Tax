public class OldTaxSystemAdapter implements TaxStrategy {
    private OldTaxSystem oldTaxSystem;

    public OldTaxSystemAdapter(OldTaxSystem oldTaxSystem) {
        this.oldTaxSystem = oldTaxSystem;
    }

    @Override
    public double calculateTax(double income) {
        // Используйте старую налоговую систему для расчета
        return oldTaxSystem.calculateOldTax(income);
    }
}
