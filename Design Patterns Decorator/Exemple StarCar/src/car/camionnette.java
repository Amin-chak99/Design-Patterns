package car;

public class camionnette extends voiture{
	public camionnette (String  description ,int  cost) {
		super (cost ,description);
	}
	
	
	String getdescription() {
		return description;
}
	int cost() {
		return cost ;
	}
	
}
