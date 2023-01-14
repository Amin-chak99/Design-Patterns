package fabriques;

import pizzas.ChessePizza;
import pizzas.ClamPizza;
import pizzas.Pizza;

public class SfaxPizzaStore extends  PizzaStore{


    public SfaxPizzaStore(){
        super();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory = new SfaxPizzaIngredientFactory();
        if (type.equals("cheese")){
            pizza=new ChessePizza(ingredientFactory);
            pizza.setName("cheese pizza style Sfax");
        } else if (type.equals("clam")){
            pizza=new ClamPizza(ingredientFactory);
            pizza.setName("clam pizza style Sfax");
        }
        return pizza;
    }



}
