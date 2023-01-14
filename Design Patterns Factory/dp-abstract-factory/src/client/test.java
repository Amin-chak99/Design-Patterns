package client;

import fabriques.PizzaStore;
import fabriques.SfaxStylePizzaStore;
import fabriques.TunisStylePizzaStore;
import pizzas.Pizza;

public class test {

	public static void main(String[] args) {
		 	
		PizzaStore tunisps =new TunisStylePizzaStore();
		tunisps.orderPizza("cheese");
		// TODO Auto-generated method stub
		PizzaStore sfaxps = new SfaxStylePizzaStore();
		sfaxps.orderPizza("cheese");

	}
	

	

}
