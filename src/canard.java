
public class canard  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck c1 = new Duck();
		FlyWithWings v1 = new FlyWithWings();
		c1.setVol(v1);
		c1.performFly();
		
		FlyNoWay v3 = new FlyNoWay();
		c1.setVol(v3);
		c1.performFly();
			}

}
