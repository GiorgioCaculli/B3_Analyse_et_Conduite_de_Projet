package dip;

/**
 * Nous créons une super classe pour rassembler l'attribut commun : ptsVie
 * La classe Sante n'est plus obligée d'avoir des points de vie strictement positifs
 * Ca sera le rôle de la classe SantePositive
 */
public abstract class Sante implements ISante {
    private double ptsVie;

    public Sante(double ptsVie) {
        this.ptsVie = ptsVie;
    }

    public double getPtsVie() {
        return ptsVie;
    }

    public void setPtsVie(double ptsVie) {
        this.ptsVie = ptsVie;
    }
}
