package ocp;

public class Bouclier {
    private double protectionInitiale;
    private double pourcentageProtection;

    public Bouclier(double pourcentageProtection) {
        this.protectionInitiale = this.pourcentageProtection = pourcentageProtection;
    }

    public void desactiver() {
        pourcentageProtection = 0;
    }

    public void activer() {
        pourcentageProtection = protectionInitiale;
    }

    public double reduireDegatsViaBouclier(double degats) {
        return degats * (1 - pourcentageProtection);
    }
}
