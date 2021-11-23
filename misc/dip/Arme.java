package dip;

public abstract class Arme implements IArme {
    private String nom;
    private double degatsMinimaux;

    public Arme(String nom, double degatsMinimaux) {
        this.nom = nom;
        this.degatsMinimaux = degatsMinimaux;
    }

    public abstract void attaquer(IVictime ennemi);

    public double getDegatsMinimaux() {
        return degatsMinimaux;
    }
}
