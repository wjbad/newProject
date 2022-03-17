package VehicleProject;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mustang car1 = new Mustang();
		car1.setBrand("Ford");
		car1.setModel("2020");
		car1.setName("Mustang");
		car1.setCostl(450000);
		
		Ranger car2 = new Ranger();
		car2.setBrand("Ford");
		car2.setModel("2021");
		car2.setName("Ranger");
		car2.setCostl(650000);
		car2.setWheels(5);
		
		
		BMWMotorCycle bike1 = new BMWMotorCycle();
		bike1.setBrand("BMW");
		bike1.setModel("2018");
		bike1.setName("BMW Cruiser");
		bike1.setCostl(150000);
		
		HondaMotorCycle bike2 = new HondaMotorCycle();
		bike2.setBrand("Honda");
		bike2.setModel("2022");
		bike2.setName("Honda SuperBike");
		bike2.setCostl(250000);
		
		System.out.println("See below stats and unique functions of your Mustang: ");
		System.out.println("Brand: " + car1.getBrand());
		System.out.println("Model: " + car1.getModel());
		System.out.println("Name: " + car1.getName());
		System.out.println("Cost: R" + car1.getCost());
		System.out.println("Number of wheels: " + car1.getWheels());
		
		car1.hoot();
		car1.powerSteering(true);
		car1.sportMode();
		System.out.println();
		
		System.out.println("See below stats and unique functions of your Ranger: ");
		System.out.println("Brand: " + car2.getBrand());
		System.out.println("Model: " + car2.getModel());
		System.out.println("Name: " + car2.getName());
		System.out.println("Cost: R" + car2.getCost());
		System.out.println("Number of wheels: " + car2.getWheels());
		
		car2.hoot();
		car2.powerSteering(false);
		car2.offRoadMode();
		System.out.println();
		
		System.out.println("See below stats and unique functions of your BMW: ");
		System.out.println("Brand: " + bike1.getBrand());
		System.out.println("Model: " + bike1.getModel());
		System.out.println("Name: " + bike1.getName());
		System.out.println("Cost: R" + bike1.getCost());
		System.out.println("Number of wheels: " + bike1.getWheels());
		
		bike1.cruseMode();
		System.out.println();
		
		System.out.println("See below stats and unique functions of your Honda: ");
		System.out.println("Brand: " + bike2.getBrand());
		System.out.println("Model: " + bike2.getModel());
		System.out.println("Name: " + bike2.getName());
		System.out.println("Cost: R" + bike2.getCost());
		System.out.println("Number of wheels: " + bike2.getWheels());
		
		bike2.powerMode();
		
		
	}

}
