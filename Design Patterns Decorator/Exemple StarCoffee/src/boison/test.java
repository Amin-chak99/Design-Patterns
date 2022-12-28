package boison;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage t1 = new tea();
		System.out.print(t1.getdescription()+": ");
		System.out.println(t1.cost());
		
		t1 = new Mint(t1);
		System.out.print(t1.getdescription()+": ");
		System.out.println(t1.cost());
		t1 = new Pine(t1);
		System.out.print(t1.getdescription()+": ");
		System.out.println(t1.cost());
		Beverage c1 = new coffee();
		System.out.print(c1.getdescription()+": ");
		System.out.println(c1.cost());
		c1 = new Milk(c1);
		System.out.print(c1.getdescription()+": ");
		System.out.println(c1.cost());
		

		
		

	}

}
