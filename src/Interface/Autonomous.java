package Interface;

public interface Autonomous extends Driverable{
    
	public static final boolean HAS_SENSORS = true;
	
	public abstract void selfDrive(); 
	
	public default void accellerate() {
		System.out.println("Default accelleration");
	}
	
	public static void selfPark() {
		System.out.println("Staticly self parking");
	}
}
