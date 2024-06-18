package homework;

//abstract class Shape{
//	public abstract double calculatearea();
//}
/*
 * rectangle : length * width;
 * circle: Math.PI * radius * radius;
 * Trapezoid : 0.5 * (base1 + base2) * height;
 */


public class ShapeTest {

	public static void main(String[] args) {

		 Rectangle rectangle = new Rectangle(5.0, 3.0);
	      Circle circle = new Circle(4.0);
	      Trapezoid trapezoid = new Trapezoid(6.0, 8.0, 4.0);

	      System.out.printf("Rectangle area: %.2f\n", rectangle.calculateArea());
	      System.out.printf("Circle area: %.2f\n", circle.calculateArea());
	      System.out.printf("Trapezoid area: %.2f\n", trapezoid.calculateArea());

	}

}
