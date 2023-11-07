public class SocialTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        if (income < 24500) {
            return 2450;
        }
        if (income > 171500) {
            return 17150;
        }
        return income * 0.035;
    }
}
