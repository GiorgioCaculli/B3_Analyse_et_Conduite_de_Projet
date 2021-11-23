package isp;

public class VaisseauArme extends Vaisseau implements IPersecuteur {
    private Arme armePrincipale;

    public VaisseauArme(Sante sante, Bouclier bouclier) {
        super(sante, bouclier);
    }

    @Override
    public void attaquer(IVictime ennemy) {
        armePrincipale.attaquer(ennemy);
    }
}
