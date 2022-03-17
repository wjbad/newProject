package constructor;

public class constructorParameters2 {
	int modelYear;
	String modelName;
	
	public constructorParameters2(int year, String name) {
		modelYear = year;
		modelName = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call the constructor by creating an object of the class
		constructorParameters2 myCar = new constructorParameters2(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName);

	}

}
