package decorateur;

import composantConcret.Boisson;

public abstract class DecorateurIngredient extends  Boisson{
    protected Boisson boisson;

    public DecorateurIngredient(Boisson boisson){
        this.boisson = boisson;
    }

    public abstract  String getDescription();
}
