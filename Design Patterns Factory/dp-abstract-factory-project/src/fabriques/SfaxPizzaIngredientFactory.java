package fabriques;

import ingredients.*;

public class SfaxPizzaIngredientFactory implements  PizzaIngredientFactory{



    @Override
    public Sauce CreateSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Chesse CreateChesse() {
        return new Parmesan();
    }

    @Override
    public Clam CreateClam() {
        return new Clovis();
    }
}
