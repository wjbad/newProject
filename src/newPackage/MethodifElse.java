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
		
		static void checkAge(int age1, int age2) {
			//return age1 + age2;
			
			int combinedAge = age1 + age2;
			//if the again is less than 18, print "access denied"
			if(combinedAge < 18) {
				System.out.println("Access Denied you are not old enough");
			} else {
				System.out.println("Access granted you are old enough!");
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(11, 8);
	}

}
