package srp;

public class Sante {
    private double ptsVie;

    public void diminuer(double degats) {
        ptsVie -= Math.max(ptsVie - degats, 0);
    }

    public boolean estVivant() {
        return ptsVie != 0;
    }
}
