package pizzas;

import ingredients.Chesse;
import ingredients.Clam;
import ingredients.Sauce;

public abstract class Pizza {


    Sauce sauce;
    Chesse cheese;
    Clam clam;
    String name;

    public Pizza(){
    }

    public void setName( String name ){
        this.name = name;
    }
    public abstract void prepare();

    public abstract void bake();
    public abstract void cut() ;

    public abstract void box() ;
}
