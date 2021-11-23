package lsp;

public class Vaisseau {
    private Sante sante;
    private Bouclier bouclier;
    private Arme armePrincipale;

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

    public void attaquer(Vaisseau ennemi) {
        armePrincipale.attaquer(ennemi);
    }

    public boolean estOperationnel() {
        return sante.estVivant();
    }

}
