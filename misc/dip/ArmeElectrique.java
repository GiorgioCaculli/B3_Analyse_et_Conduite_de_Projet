package dip;

public class ArmeElectrique extends Arme {
    public ArmeElectrique(String nom, double degatsMinimaux) {
        super(nom, degatsMinimaux);
    }

    @Override
    public void attaquer(IVictime ennemi) {
        ennemi.desactiverBouclier();
    }
}
