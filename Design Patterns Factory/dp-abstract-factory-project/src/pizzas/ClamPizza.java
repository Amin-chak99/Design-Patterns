package pizzas;

import fabriques.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public  ClamPizza(PizzaIngredientFactory ingredientFactory ){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("entrain de preparer " + name );
        sauce = ingredientFactory.CreateSauce();
        clam = ingredientFactory.CreateClam();
        cheese = ingredientFactory.CreateChesse();

        System.out.println("sauce =  " + sauce );
        System.out.println("clam =  " + clam );
        System.out.println("cheese =  " + cheese );
    }

    @Override
    public void bake() {

    }

    @Override
    public void cut() {

    }

    @Override
    public void box() {

    }
}
