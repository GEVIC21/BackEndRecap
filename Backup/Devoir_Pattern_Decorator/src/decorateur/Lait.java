package decorateur;

import composantConcret.Boisson;

public class Lait extends DecorateurIngredient {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au lait";
    }

    @Override
    public double cout() {
        return 200 +boisson.cout();
    }
}
