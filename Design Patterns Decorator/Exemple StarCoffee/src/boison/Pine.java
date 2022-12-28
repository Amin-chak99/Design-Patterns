package boison;

public class Pine extends CondimentDecorator {
	public Pine(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	public int cost() {
		return 200 + beverage.cost();
	}
	String getdescription() {
		return beverage.getdescription()+" with pine";
	}

}
