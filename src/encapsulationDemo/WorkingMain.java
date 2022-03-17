package encapsulationDemo;

public class WorkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person myObj = new Person();
		
		//Set the value of the name value to Wessel
		myObj.setName("Wessel");
		
		System.out.println(myObj.getName());
	}

}


// Summary
// Why do we need Encapsulation?

// Better control of class attributes and methods
// Increased security of data
// Class attributes can be make read-only (if you only use the get method)
// or write-only (if you only use the set method)