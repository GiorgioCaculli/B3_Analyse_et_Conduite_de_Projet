package isp;

public abstract class Vaisseau implements IVaisseau, IVictime {
    private Sante sante;
    private Bouclier bouclier;

    public Vaisseau(Sante sante, Bouclier bouclier) {
        this.sante = sante;
        this.bouclier = bouclier;
    }

    public void desactiverBouclier() {
        bouclier.desactiver();
    }

    public void activerBouclier() {
        bouclier.activer();
    }

    public void recevoirDegats(double degats) {
        double degatsDiminues = bouclier.reduireDegatsViaBouclier(degats);
        sante.diminuer(degatsDiminues);
    }

    public boolean estOperationnel() {
        return sante.estVivant();
    }

}
