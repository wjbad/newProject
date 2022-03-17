package OOPreVise;

public class Car extends Vehicle {
	
	String modelName = "Mustang";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a myCar object
		Car myCar = new Car();
		
		//call the honk method from the vehicle class on the mycar object
		myCar.honk();
		
		//display
		System.out.println(myCar.brand + " " + myCar.modelName);
	}

}
