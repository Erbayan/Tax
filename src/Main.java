import AdapterPattern.*;
import DecoratorPattern.*;
import FactoryPattern.PensionFactory;
import FactoryPattern.SocialMedicalFactory;
import FactoryPattern.SocialFactory;
import FactoryPattern.TaxFactory;
import StrategyPattern.TaxStrategy;
import SingletonPattern.TaxApplication;

class Entrepreneur {
    private TaxStrategy pensionTaxStrategy;
    private TaxStrategy socialMedicalTaxStrategy;
    private TaxStrategy socialTaxStrategy;

    public Entrepreneur(TaxStrategy pensionTaxStrategy, TaxStrategy socialMedicalTaxStrategy, TaxStrategy socialTaxStrategy) {
        this.pensionTaxStrategy = pensionTaxStrategy;
        this.socialMedicalTaxStrategy = socialMedicalTaxStrategy;
        this.socialTaxStrategy = socialTaxStrategy;
    }

    public double calculateTax(double income) {
        double pensionTax = pensionTaxStrategy.calculateTax(income);
        double socialMedicalTax = socialMedicalTaxStrategy.calculateTax(income);
        double socialTax = socialTaxStrategy.calculateTax(income);
        return pensionTax + socialMedicalTax + socialTax;
    }
}

public class Main {
    public static void main(String[] args) {
        TaxFactory factory = new PensionFactory();
        TaxStrategy pensionTaxStrategy = factory.createTaxStrategy();
        factory = new SocialMedicalFactory();
        TaxStrategy socialMedicalTaxStrategy = factory.createTaxStrategy();
        factory  = new SocialFactory();
        TaxStrategy socialTaxStrategy = factory.createTaxStrategy();

        System.out.println("PensionTax: "+pensionTaxStrategy.calculateTax(1000000));
        System.out.println("SocialMedicalTax: "+socialMedicalTaxStrategy.calculateTax(1000000));
        System.out.println("SocialTax: "+socialTaxStrategy.calculateTax(1000000));

        Entrepreneur entrepreneur1 = new Entrepreneur(pensionTaxStrategy, socialMedicalTaxStrategy, socialTaxStrategy);
        double income1 = 1000000;
        double tax1 = entrepreneur1.calculateTax(income1);
        System.out.println("Entrepreneur's tax: " +tax1);


        PersonStatus pensioner = new Pensioner();
        PersonStatus disabled = new SocialTaxDecorator(new Disabled());
        PersonStatus disabledMother = new SocialTaxDecorator(new PensionTaxDecorator(new Mother()));

        double income = 1000000;
        double taxForPensioner = pensioner.calculateTax(income);
        double taxForMother = disabledMother.calculateTax(income);
        double taxForDisabled = disabled.calculateTax(income);
        System.out.println("Tax For Pensioner: "+taxForPensioner);
        System.out.println("Tax For Disabled: "+taxForDisabled);
        System.out.println("Tax For Mother: "+taxForMother);

        OldTaxSystem oldPensionTaxStrategy = new OldPensionTax();
        OldTaxSystem oldSocialMedicalTaxStrategy = new OldSocialMedicalTax();
        OldTaxSystem oldSocialTaxStrategy = new OldSocialTax();



        OldTaxSystemAdapter adapterForOldPension = new OldTaxSystemAdapter(oldPensionTaxStrategy);
        OldTaxSystemAdapter adapterForOldMedical = new OldTaxSystemAdapter(oldSocialMedicalTaxStrategy);
        OldTaxSystemAdapter adapterForOldSocial = new OldTaxSystemAdapter(oldSocialTaxStrategy);

        double taxForOldPension = adapterForOldPension.calculateTax(income);
        double taxForOldMedical = adapterForOldMedical.calculateTax(income);
        double taxForOldSocial = adapterForOldSocial.calculateTax(income);

        System.out.print("OldTax: ");
        System.out.println(taxForOldMedical + taxForOldPension + taxForOldSocial);

        TaxApplication taxApp = TaxApplication.getInstance();

        taxApp.getTaxStrategyManager().changeTaxStrategy(pensionTaxStrategy);

        Pensioner pensioner1 = new Pensioner();
        Disabled disabled1 = new Disabled();
        Mother mother1 = new Mother();

        taxApp.addObserver(pensioner1);
        taxApp.addObserver(disabled1);
        taxApp.addObserver(mother1);

        double tax = taxApp.getTaxStrategyManager().calculateTax(income);
        System.out.println("Tax: " + tax);
        taxApp.getTaxStrategyManager().changeTaxStrategy(socialTaxStrategy);
        tax = taxApp.getTaxStrategyManager().calculateTax(income);
        System.out.println("Tax with new strategy: " + tax);
        taxApp.notifyObservers();

    }
}