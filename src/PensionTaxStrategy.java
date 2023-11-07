public class PensionTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        if (income > 3500000) {
            return 350000;
        }
        return income * 0.1;
    }
}
