package car;

public class test {

	public static void main(String[] args) {
		voiture v1 = new camionnette("P404",10000);
		voiture v2 = new berline("P407", 20000);
			v1 = new Abs(v1,800);
			v1 = new VitreElectrique(v1,1000);
			v1 = new AirBag(v1,1200);


			v2 = new VitreElectrique(v2,1000);
			v2 = new AirBag(v2,1200);
		System.out.println("La voiture est " +v1.getdescription());
		System.out.println("Son prix est " + v1.cost());
		
		System.out.println("La voiture est une " + v2.getdescription());
		System.out.println("Son prix est: " + v2.cost());

	}

}