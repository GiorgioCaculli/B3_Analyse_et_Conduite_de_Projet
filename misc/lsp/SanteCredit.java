package lsp;

public class SanteCredit extends Sante {
    private double credit;

    public SanteCredit(double ptsVie, double credit) {
        super(ptsVie);
        this.credit = credit;
    }

    @Override
    public void diminuer(double montant) {
        final double ptsVie = getPtsVie() - Math.max(getPtsVie() - montant, -credit);
        setPtsVie(ptsVie);
    }

    @Override
    public boolean estVivant() {
        return getPtsVie() > -credit;
    }
}
