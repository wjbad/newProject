package OOPreVise;

public class Constructor {
	
	// create a class attribute
	int x;
	
	//create a class constructor of the class called Constructor
	public Constructor() {
		// set the initial value for the call attribute
		x = 5;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object of the class
		Constructor myCon = new Constructor();
		System.out.println(myCon.x);
		
	}

}
