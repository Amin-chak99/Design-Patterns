package fabriques;

import pizzas.Pizza;
import pizzas.SfaxStyleCheesePizza;
import pizzas.SfaxStyleClamPizza;
import pizzas.SfaxStylePepperoniPizza;

public class SfaxStylePizzaStore extends PizzaStore {
	Pizza pizza;


	Pizza createPizza(String type) {
		Pizza pizza=null;
		if (type.equals("cheese")){
		pizza=new SfaxStyleCheesePizza();
		} else if (type.equals("pepperoni")){
		pizza=new SfaxStylePepperoniPizza();
		} else if (type.equals("clam")){
		pizza=new SfaxStyleClamPizza();
		}
		return pizza;
		}

	
}
