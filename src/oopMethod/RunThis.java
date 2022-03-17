package oopMethod;

public class RunThis {
	
	// here we created a static method
	// this means that it can be access without creating an object of the class
	static void myMethod() {
		System.out.println("hello world");
		
	}
	
	//unlike public, which can only be accessed by objects
	public void myPublicMethod() {
		System.out.println("Public method must be called by creating object");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an instance of our class
		myMethod();
		
		RunThis rt = new RunThis();
		rt.myPublicMethod();
		
	}

}

// Notes

