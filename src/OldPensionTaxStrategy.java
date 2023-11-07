public class OldPensionTaxStrategy implements OldTaxSystem {
    @Override
    public double calculateOldTax(double income) {
        // Расчет старого налога
        if (income > 3000000) {
            return 300000;
        }
        return income * 0.1;
    }
}
