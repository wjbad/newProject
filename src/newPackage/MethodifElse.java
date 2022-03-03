package newPackage;

public class MethodifElse {

	//It is common to use if... else statement inside the method
	//Create a checkAge() method with an integer variable called age
//	static void checkAge(int age) {
//		//if the again is less than 18, print "access denied"
//		if(age < 18) {
//			System.out.println("Access Denied you are not old enough");
//		} else {
//			System.out.println("Access granted you are old enough!");
//		}
		
		static int checkAge(int age1, int age2) {
			int z = return age1+age2;
			//if the again is less than 18, print "access denied"
			if(z < 18) {
				System.out.println("Access Denied you are not old enough");
			} else {
				System.out.println("Access granted you are old enough!");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(50, 1);
	}

}
