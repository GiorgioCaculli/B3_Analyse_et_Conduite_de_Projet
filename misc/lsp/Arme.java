package lsp;

public abstract class Arme {
    private String nom;
    private double degatsMinimaux;

    public Arme(String nom, double degatsMinimaux) {
        this.nom = nom;
        this.degatsMinimaux = degatsMinimaux;
    }

    public abstract void attaquer(Vaisseau ennemi);

    public double getDegatsMinimaux() {
        return degatsMinimaux;
    }
}
