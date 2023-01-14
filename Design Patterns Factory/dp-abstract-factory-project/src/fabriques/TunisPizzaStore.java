package fabriques;

import pizzas.ChessePizza;
import pizzas.ClamPizza;
import pizzas.Pizza;

public class TunisPizzaStore extends  PizzaStore{


    public  TunisPizzaStore(){
        super();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory = new TunisPizzaIngredientFactory();
        if (type.equals("cheese")){
            pizza=new ChessePizza(ingredientFactory);
            pizza.setName("cheese pizza style tunis");
        } else if (type.equals("clam")){
            pizza=new ClamPizza(ingredientFactory);
            pizza.setName("clam pizza style tunis");
        }
        return pizza;
    }


}
