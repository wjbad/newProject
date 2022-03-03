package newPackage;

public class MethodsDemo2 {

	//static void demoMethodOneString(String fName) {
//		//code to be executed
//		System.out.println(fName + " is the first name");
//	}
//	
//	static void demoMethodZeroParams() {
//		//code to be executed
//		System.out.println("This Method doesnt expect any parameters");
//	}
//	
//	static void demoMethodStringAge(String fName, int iAge) {
//		//code to be executed
//		System.out.println(fName + " is the first name" + " and " + iAge + " is the age");
//	}
//	
//	static void demoMethodNameFriend(String fName, String fFriend) {
//		//code to be executed
//		System.out.println(fName + " is the first name" + " and " + fFriend + " is the friends name");
//	}
//	
//	static int returnInt(int x) {
//		System.out.println("this is inside the retunInt method " + "and this is the pram value for x " + x);
//		return 6;
//	}
	
	static String demoMethodStringPrac(String fName, String sName, int iAge) {
		//code to be executed
		System.out.println(fName + " is the first name " + sName + " is the surname" + " and " + iAge + " is the age");
		return "This it";
	}
	
	static int returnPrac(int x) {
		//System.out.println("this is inside the retunInt method " + "and this is the pram value for x " + x);
		return 100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is in the Main Method");
//		demoMethodOneString("Precious");
//		demoMethodOneString("Wessel");
//		demoMethodOneString("Diana");
//		demoMethodOneString("Luan");
//		demoMethodOneString("Priven");
//		demoMethodOneString("Lance");
//		demoMethodOneString("Antionette");
//		demoMethodNameFriend("Antionette","Wessel");
//		demoMethodStringAge("Antionette",33);
//		demoMethodZeroParams();
//		demoMethodZeroParams();
		//System.out.println(returnInt(99));
		//int returnValue = returnInt(99);
		//System.out.println(returnValue + " is the return value");
		demoMethodStringPrac("Wessel", "Badenhorst", 39);
		int returnValue = returnPrac(100);
		System.out.println("Hi, your name is " + fName + sName + " and your age * 100 is " + (iAge*returnValue));
	}

}
