package isp;

public class Cargo extends Vaisseau {
    private double poidsEmbarque;

    public Cargo(Sante sante, Bouclier bouclier, double poidsEmbarque) {
        super(sante, bouclier);
        this.poidsEmbarque = poidsEmbarque;
    }
}
