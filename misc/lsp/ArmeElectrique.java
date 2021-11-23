package lsp;

import ocp.Vaisseau;

public class ArmeElectrique extends Arme {
    public ArmeElectrique(String nom, double degatsMinimaux) {
        super(nom, degatsMinimaux);
    }

    @Override
    public void attaquer(Vaisseau ennemi) {
        ennemi.desactiverBouclier();
    }
}
