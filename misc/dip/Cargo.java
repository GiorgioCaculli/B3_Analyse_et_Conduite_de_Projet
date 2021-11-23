package dip;

public class Cargo extends Vaisseau {
    private double poidsEmbarque;

    public Cargo(ISante sante, IProtectionDesactivable bouclier, double poidsEmbarque) {
        super(sante, bouclier);
        this.poidsEmbarque = poidsEmbarque;
    }
}
