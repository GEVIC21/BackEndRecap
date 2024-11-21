package decorateur;

import composantConcret.Boisson;

public class Chocolat extends DecorateurIngredient {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 400 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Chocolat";
    }
}
