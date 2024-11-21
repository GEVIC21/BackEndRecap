package decorateur;

import composantConcret.Boisson;

public class Chantilly extends DecorateurIngredient {
    public Chantilly(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 900 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au Chantilly";
    }
}
