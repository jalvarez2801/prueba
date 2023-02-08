package test.test.ocp;

public class Main {
	public static void main(String[] args) {
		Shape[] shapes = { new Circle(1), new Rectangle(1, 2), new Circle(2), new Rectangle(2, 4) };

		for (Shape shape : shapes) {
			System.out.println("Area: " + shape.area());
		}
	}
}
