package OOPreVise;

public class Boerboel extends Dog {

	String breedName = "Boerboel";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a myDog object
		Boerboel myDog = new Boerboel();
		Boerboel myDog2 = new Boerboel();
		myDog2.breed = "Small Breed";
		myDog2.breedName = "Jack Russell";
		myDog2.bark = "Woof Woof";
		myDog2.speed = "moves fast";
		
		//call the bark/speed method from the Dog class on the myDog object
//		myDog.bark();
//		myDog.speed();
//		myDog2.bark();
//		myDog2.speed();
		
		//display
		System.out.println("Your " + myDog.breed + " " + myDog.breedName + " " + myDog.getspeed() + " and barks " + myDog.getbark());
		System.out.println("Your " + myDog2.breed + " " + myDog2.breedName + " " + myDog2.getspeed() + " and barks " + myDog2.getbark());
	}

}
