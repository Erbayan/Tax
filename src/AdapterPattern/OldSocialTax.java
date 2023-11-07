package AdapterPattern;

public class OldSocialTax implements OldTaxSystem {
    @Override
    public double calculateOldTax(double income) {
        if (income < 21000) {
            return 2100;
        }
        if (income > 147000) {
            return 14700;
        }
        return income * 0.035;
    }
}
