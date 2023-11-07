package AdapterPattern;

public class OldPensionTax implements OldTaxSystem {
    @Override
    public double calculateOldTax(double income) {
        if (income > 3000000) {
            return 300000;
        }
        return income * 0.1;
    }
}
