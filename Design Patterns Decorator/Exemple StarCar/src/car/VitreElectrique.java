package car;

public class VitreElectrique extends optionDecorator {

	public VitreElectrique(voiture vtr , int cost) {
		super(vtr , cost);
		this.cost=cost;
		
		// TODO Auto-generated constructor stub
	}
	public int cost() {
		return cost + vtr.cost();
	}
	String getdescription() {
		return vtr.getdescription()+" with VtrElec";
	}

}
