package Abstraction2;

public abstract class Student {
      
	int age;
	
	public Student(int age) {
		this.age = age;
	}
	
	public abstract void attendClass();
}

class LocalStudent extends Student{

	int seatID;
	
	public LocalStudent() {
		super(100);
		
	}

	@Override
	public void attendClass() {
		
		
	}
	
	
}

