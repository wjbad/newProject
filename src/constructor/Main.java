package constructor;

public class Main {
	// Create a class attribute
	int x;
	
	// create a class constructor for the Main class
	public Main() {
		// set the initial value for the class attribute x
		x = 5;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an object of class Main (This will call the constructor)
		Main myObj = new Main();
		
		// print the value of x
		System.out.println(myObj.x);
		
		//Note
		 // that the constructor name must match the class name,
		 // and cannot have a return type (void String or int)
		 // also note that the constructor is called when the object is created
		 // All classes do in fact have a constructor by default: if you dont create a class constructor, Java creates it for you.
		 // However , then you are not able to set initial values for the object attributes
		
	}

}
