package lsp;

public class SantePositive extends Sante {
    public SantePositive(double ptsVie) {
        super(ptsVie);
    }

    public void diminuer(double montant) {
        final double ptsVie = Math.max(getPtsVie() - montant, 0);
        setPtsVie(ptsVie);
    }

    public boolean estVivant() {
        return getPtsVie() > 0;
    }
}
