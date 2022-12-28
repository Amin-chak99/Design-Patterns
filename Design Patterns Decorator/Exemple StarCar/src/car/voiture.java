package car;

public abstract class voiture {
	protected int cost;
	protected String description;
	public voiture(int cost) {
		this.cost = cost;
		// TODO Auto-generated constructor stub
	}
	public voiture() {}

	public voiture(int cost, String description) {
		this.cost = cost;
		this.description=description ;
		// TODO Auto-generated constructor stub
	}
	abstract String getdescription();;
	abstract int cost();
}
