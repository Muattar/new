package Interface;

public class Main {
   public static void main(String[] args) {
	
	   Tesla t = new Tesla();
	   Honda h = new Honda();
	   
	   t.start();
	   t.stop();
	   t.accellerate();
	   t.selfDrive();
	  Autonomous.selfPark();//static method from Autonomous interface class
	  System.out.println(Tesla.HAS_SENSORS);
	   t.driveit();
	  
	   Driverable.pass();
	   
	   
	   
}
}










