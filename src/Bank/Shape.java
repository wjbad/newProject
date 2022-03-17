package Bank;

public class Shape {
	public void area() {
		System.out.println("Thank you for selecting a shape");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle();
		Triangle myTriangle = new Triangle();
		Rectangle myRecT = new Rectangle();
		myCircle.area();
		myTriangle.area();
		myRecT.area();
		

	}
	}

	class Circle extends Shape {
		public void area() {
			System.out.println("Thank you for selecting the shape: Circle!");
	}
	}

	class Triangle extends Shape {
		public void area() {
			System.out.println("Thank you for selecting the shape: Triangle!");
	}
	}
	class Rectangle extends Shape {
		public void area() {
			System.out.println("Thank you for selecting the shape: Rectangle!");
	}

}
