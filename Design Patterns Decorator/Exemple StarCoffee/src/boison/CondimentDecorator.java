package boison;

public abstract class CondimentDecorator extends Beverage{
	protected Beverage beverage ;
	
	public CondimentDecorator (Beverage beverage) {
		this.beverage=beverage;
		
		
	}
	public abstract int cost();
	String getdescription() {
		return null;
	}
	

}
