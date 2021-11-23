package ocp;

public class ArmeStandard extends Arme {
    public ArmeStandard(String nom, double degatsMinimaux) {
        super(nom, degatsMinimaux);
    }

    @Override
    public void attaquer(Vaisseau ennemi) {
        ennemi.recevoirDegats(getDegatsMinimaux());
    }
}
