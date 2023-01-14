package fabriques;

import ingredients.*;

public class TunisPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Sauce CreateSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Chesse CreateChesse() {
        return new Mozzarella();
    }

    @Override
    public Clam CreateClam() {
        return new Palourde();
    }
}
