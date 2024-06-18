package homework;

public class Trapezoid extends ShapeTest {
	double num1;
	double num2;
	double num3;
 //Trapezoid : 0.5 * (base1 + base2) * height;
	public Trapezoid(double num1, double num2, double num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		
		
	}

	public Object calculateArea() {
		// TODO Auto-generated method stub
		return 0.5*(num1 + num2) * num3;
	}
}
