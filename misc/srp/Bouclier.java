package srp;

public class Bouclier {
    private double pourcentageProtection;

    public Bouclier(double pourcentageProtection) {
        this.pourcentageProtection = pourcentageProtection;
    }

    public boolean estActif() {
        return pourcentageProtection != 0;
    }

    public double reduireDegatsViaBouclier(double degats) {
        return degats * (1 - pourcentageProtection);
    }

}
