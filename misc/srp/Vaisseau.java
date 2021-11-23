package srp;

public class Vaisseau {
    private Sante sante;
    private Bouclier bouclier;

    public Vaisseau(Sante sante, Bouclier bouclier) {
        this.sante = sante;
        this.bouclier = bouclier;
    }

    public double reduireDegatsViaBouclier(double degats) {
        return bouclier.reduireDegatsViaBouclier(degats);
    }

    public void recevoirDegats(double ptsDegats) {
        sante.diminuer(ptsDegats);
    }

    public boolean bouclierEstActif() {
        return bouclier.estActif();
    }

    public boolean estOperationnel() {
        return sante.estVivant();
    }
}
