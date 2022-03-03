package newPackage;

public class StoreVariable {
	
	//you can also store the results in a variable (recommended, as it is easier to read and maintain)
	static int myMethod(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z = myMethod(5, 4);
		System.out.println("This is the return value " + z);		
	}

}
