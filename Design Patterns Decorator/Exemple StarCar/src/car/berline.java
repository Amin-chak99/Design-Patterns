package car;

public class berline extends voiture{
	public berline (String  description ,int  cost) {
		super (cost ,description);
	}
	
	
	String getdescription() {
		return description;
}
	int cost() {
		return cost ;
	}
	
}
