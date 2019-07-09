package Interface;
         // Tesla first concrete class
public class Tesla extends Vehicle implements Autonomous{

	@Override
	public void selfDrive() {
		System.out.println("Tesla is in auto pilot mode");
		
	}

	@Override
	public void driveit() {
		System.out.println("Tesla is being driven by Code");
		
	}
      
	
	
}
