package fabriques;

import pizzas.Pizza;

public abstract class PizzaStore {
    Pizza pizza;
    public PizzaStore(){

    }

    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
