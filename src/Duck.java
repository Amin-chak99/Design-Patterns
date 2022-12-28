
public class Duck {
 FlyBehavior fbehavior ;
 QuackBehavior qbehavior ;
  void peformQuack() {}
  void swim() {}
  void display() {}
  public void performFly() {
	  fbehavior.fly();}
  
  public void setVol(FlyBehavior cv) {
	  fbehavior = cv ;
  }
}
