package AdapterPattern;

public class OldSocialMedicalTax implements OldTaxSystem {
    @Override
    public double calculateOldTax(double income) {
        return 4200;
    }
}
