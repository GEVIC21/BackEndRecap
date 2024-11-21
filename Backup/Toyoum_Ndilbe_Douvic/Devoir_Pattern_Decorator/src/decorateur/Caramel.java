package decorateur;

import composantConcret.Boisson;

public class Caramel extends DecorateurIngredient {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 800 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Caramel";
    }
}
