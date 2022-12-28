package boison;

public class whip extends CondimentDecorator {
	public whip(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	public int cost() {
		return 200 + beverage.cost();
	}
	String getdescription() {
		return beverage.getdescription()+" with whip";
	}


}
