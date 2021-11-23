package dip;

public class ArmeStandard extends Arme {
    public ArmeStandard(String nom, double degatsMinimaux) {
        super(nom, degatsMinimaux);
    }

    @Override
    public void attaquer(IVictime ennemi) {
        ennemi.recevoirDegats(getDegatsMinimaux());
    }
}
