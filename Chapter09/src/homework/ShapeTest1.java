package homework;

abstract class Shape {
	public abstract double calculateArea();
}
/*
 * rectangle : length * width;
 * circle: Math.PI * radius * radius;
 * Trapezoid : 0.5 * (base1 + base2) * height;
 */
class Rectangle1 extends Shape {
	double length;
	double width;
	
	public Rectangle1(double num1, double num2){
		this.length = length;
		this.width = width;
		
		
		
	}
//rectangle : length * width;
	@Override
	public double calculateArea() {
		// 사각형 면적 재정의
		return length * width;
	}
}

class Circle1 extends Shape {
	double radius;
	
	
	public Circle1(double radius){
		this.radius = radius;
		
		
		
		
	}

	@Override
	public double calculateArea() {
		// 원 면적 재정의
		return Math.PI * radius * radius;
	}

}

class Trapezoid1 extends ShapeTest {
	double base1;
	double base2;
	double height;
	
	
	public Trapezoid1(double base1, double base2,double height){
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
		
		
		
		
	}

	public double calculateArea() {
		// 사다리꼴 면적 재정의
		return 0.5 * (base1 + base2) * height;
	}
	
}

public class ShapeTest1 {

	public static void main(String[] args) {
			//Shape shape = new Shape
		  Rectangle1 rectangle1 = new Rectangle1(5.0, 3.0);
	      Circle1 circle1 = new Circle1(4.0);
	      Trapezoid1 trapezoid1 = new Trapezoid1(6.0, 8.0, 4.0);

	      System.out.printf("Rectangle1 area: %.2f\n", rectangle1.calculateArea());
	      System.out.printf("Circle1 area: %.2f\n", circle1.calculateArea());
	      System.out.printf("Trapezoid1 area: %.2f\n", trapezoid1.calculateArea());

	}

}
