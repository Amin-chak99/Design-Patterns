package fabriques;

import pizzas.Pizza;
import pizzas.TunisStyleCheesePizza;
import pizzas.TunisStyleClamPizza;
import pizzas.TunisStylePepperoniPizza;

public class TunisStylePizzaStore extends PizzaStore {
	
	Pizza createPizza(String type) {
		Pizza pizza=null;
		if (type.equals("cheese")){
		pizza=new TunisStyleCheesePizza();
		} else if (type.equals("pepperoni")){
		pizza=new TunisStylePepperoniPizza();
		} else if (type.equals("clam")){
		pizza=new TunisStyleClamPizza();
		}
		return pizza;
	}



	

	
	}


