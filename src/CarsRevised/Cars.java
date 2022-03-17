package CarsRevised;


public class Cars {
	String make;
	String vechicleType;
	String colour;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cars car1 = new Cars();
		car1.make = "Ferrari";
		car1.vechicleType = "Sportscar";
		car1.colour = "Red";
		System.out.println("The " + car1.make + " is " + car1.colour + " and the type of vehcile is " + car1.vechicleType );
		
		Cars car2 = new Cars();
		car2.make = "Jeep";
		car2.vechicleType = "SUV";
		car2.colour = "Blue";
		System.out.println("The " + car2.make + " is " + car2.colour + " and the type of vehcile is " + car2.vechicleType );
	}

}
