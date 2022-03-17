package inheritanceDemo;

public class Car extends Vehicle {
	private String modelName = "Mustang";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an object of the car class
		Car myCar = new Car();
		Car myCar2 = new Car();
		
		// call the honk method (from the vehicle class) on the myCar object
		myCar.brand = "Ford";
		myCar.model = "2022";
		myCar.name = "Mustang";
		myCar.cost = 450000;
		
		myCar.honk();
		
		//display the attribute values
		System.out.println("My " + myCar.brand + " " + myCar.name + " " + myCar.model + " was sold for R " + myCar.cost);
		
		myCar2.brand = "Ford";
		myCar2.model = "2021";
		myCar2.name = "Ranger";
		myCar2.cost = 350000;
		
		//display the attribute values
		System.out.println("My " + myCar2.brand + " " + myCar2.name + " " + myCar2.model + " was sold for R " + myCar2.cost);

	}

}
