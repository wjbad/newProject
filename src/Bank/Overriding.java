package Bank;

/* Method oveeriding refers to a different implementation of a method in  a subclass.
 * The method must have already been defined in the parent class.
 

The overriding method (i.e the one is the subclass) must have the same method signature as that in the superclass.
The return type of the overriding method may be the same or a subtype of the one in the superclass.

Overriding is generally used to include a specific implementation of an object behavior in the subclass.
*/

public class Overriding {
	public void message() {
		System.out.println("Thank you for opening an account with us!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding myAccount = new Overriding();
		Savings mySavings = new Savings();
		FixedDeposit myFixedDepo = new FixedDeposit();
		myAccount.message();
		mySavings.message();
		myFixedDepo.message();
		}
		}

		class Savings extends Overriding {
		public void message() {
		System.out.println("Thank you for opening a Savings account with us!");
		
		}
		}
		class FixedDeposit extends Overriding {
		public void message() {
		System.out.println("Thank you for opening a Fixed Deposit account with us!");
		}

}
