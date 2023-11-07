public class SocialTaxDecorator implements PersonStatus {
    private PersonStatus personStatus;

    public SocialTaxDecorator(PersonStatus personStatus) {
        this.personStatus = personStatus;
    }

    @Override
    public double calculateTax(double income) {
        double existingTax = personStatus.calculateTax(income);
        return existingTax + calculatedSocialTax(income);
    }

    private double calculatedSocialTax(double income) {
        if (income < 24500) {
            return 2450;
        }
        if (income > 171500) {
            return 17150;
        }
        return income * 0.035;
    }
}
