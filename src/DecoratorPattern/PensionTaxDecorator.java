package DecoratorPattern;

import DecoratorPattern.PersonStatus;

public class PensionTaxDecorator implements PersonStatus {
    private PersonStatus personStatus;

    public PensionTaxDecorator(PersonStatus personStatus) {
        this.personStatus = personStatus;
    }

    @Override
    public double calculateTax(double income) {
        double existingTax = personStatus.calculateTax(income);
        return existingTax + calculatedPensionTax(income);
    }

    private double calculatedPensionTax(double income) {
        if (income > 3500000) {
            return 350000;
        }
        return income * 0.1;
    }
}
