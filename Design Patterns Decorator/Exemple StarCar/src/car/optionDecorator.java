package car;

public abstract class optionDecorator extends voiture {
	protected voiture vtr ;
	
	
	public optionDecorator (voiture vtr, int cost ) {
		this.vtr=vtr;
		
	}
	
	public abstract int cost();
	String getdescription() {
		return null;
	}
	


}
