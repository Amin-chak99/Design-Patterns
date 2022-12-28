import java.util.Scanner;

public class canardV2 {

	private static final String FlyBehavior = null;

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Scanner S1 = new Scanner(System.in);
		 System.out.println("Nom du comportement");
         String type = S1.nextLine();
         Class b1 =Class.forName(type);
         FlyBehavior v = (FlyBehavior)b1.newInstance();
         Duck c1 = new Duck();

		c1.setVol(v);
		
 		c1.performFly();

			}
}
