package client;

import fabriques.PizzaStore;
import fabriques.SfaxPizzaStore;
import fabriques.TunisPizzaStore;

public class test {

    public static void main(String[] args) {

        PizzaStore tunisps =new TunisPizzaStore();
        tunisps.orderPizza("cheese");
        System.out.println("**************************************************");
        PizzaStore sfaxps = new SfaxPizzaStore();
        sfaxps.orderPizza("cheese");

    }




}
