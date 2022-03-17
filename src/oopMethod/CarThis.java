package oopMethod;

public class CarThis {
	
		static void welcome() {
			System.out.println("Welcome to the Cars page");
		}
		
		static void goodbye() {
			System.out.println("Goodbye from the Cars Page");
		
		}

		String brand;
		int fuelCapacity;
		int warrantyYears;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//create an instance of our class
			CarThis car = new CarThis();
			car.brand = "Toyota";
			car.fuelCapacity = 60;
			car.warrantyYears = 2;
			
			welcome();
			System.out.println("The car brand is " + car.brand);
			System.out.println("The car's fuel capacity is " + car.fuelCapacity);
			System.out.println("The car's warranty period is " + car.warrantyYears + " years");
			car.drive();
			car.fuelAlert();
			goodbye();
			System.out.println();
			
			CarThis car2 = new CarThis();
			car2.brand = "BMW";
			car2.fuelCapacity = 55;
			car2.warrantyYears = 3;
			
			welcome();
			System.out.println("The car brand is " + car2.brand);
			System.out.println("The car's fuel capacity is " + car2.fuelCapacity);
			System.out.println("The car's warranty period is " + car2.warrantyYears + " years");
			car2.drive();
			car2.fuelAlert();
			goodbye();
			
		}

		public void fuelAlert() {
			// TODO Auto-generated method stub
			
		}

		public void drive() {
			// TODO Auto-generated method stub
			
		}
}
