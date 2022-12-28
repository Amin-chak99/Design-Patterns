package boison;

public class Mint extends CondimentDecorator{
	public Mint(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	public int cost() {
		return 300 + beverage.cost() ;
	}
	String getdescription() {
		return beverage.getdescription()+" with mint";
	}


}
