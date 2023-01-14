package fabriques;

import ingredients.Chesse;
import ingredients.Clam;
import ingredients.Sauce;

public interface PizzaIngredientFactory {

    public Sauce CreateSauce ();

    public Chesse CreateChesse();

    public Clam CreateClam ();
}
