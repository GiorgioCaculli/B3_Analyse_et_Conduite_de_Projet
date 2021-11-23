package ocp;

public class ArmeExplosion extends Arme {
    public ArmeExplosion(String nom, double degatsMinimaux) {
        super(nom, degatsMinimaux);
    }

    @Override
    public void attaquer(Vaisseau ennemi) {
        ennemi.desactiverBouclier();
        ennemi.recevoirDegats(getDegatsMinimaux());
        ennemi.activerBouclier();
    }
}
