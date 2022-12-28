package boison;

public class Milk extends CondimentDecorator{
	public Milk(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	public int cost() {
		return 350 + beverage.cost();
	}
	String getdescription() {
		return beverage.getdescription()+ " with milk";
	}


}
