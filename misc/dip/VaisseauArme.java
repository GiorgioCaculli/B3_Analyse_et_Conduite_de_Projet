package dip;

public class VaisseauArme extends Vaisseau implements IPersecuteur {
    // Possède maintenant une interface en tant que dépendance
    private IArme armePrincipale;

    public VaisseauArme(ISante sante, IProtectionDesactivable bouclier, IArme armePrincipale) {
        super(sante, bouclier);
        this.armePrincipale = armePrincipale;
    }

    @Override
    public void attaquer(IVictime ennemy) {
        armePrincipale.attaquer(ennemy);
    }
}
