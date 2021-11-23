package dip;

public abstract class Vaisseau implements IVaisseau, IVictime {
    // Possède maintenant des interfaces en tant que dépendances
    private ISante sante;
    private IProtectionDesactivable protection;

    public Vaisseau(ISante sante, IProtectionDesactivable protection) {
        this.sante = sante;
        this.protection = protection;
    }

    public void desactiverBouclier() {
        protection.desactiver();
    }

    public void activerBouclier() {
        protection.activer();
    }

    public void recevoirDegats(double degats) {
        double degatsDiminues = protection.reduireDegats(degats);
        sante.diminuer(degatsDiminues);
    }

    public boolean estOperationnel() {
        return sante.estVivant();
    }

}
