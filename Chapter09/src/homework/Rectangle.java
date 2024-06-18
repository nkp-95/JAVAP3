package homework;

public class Rectangle extends ShapeTest {
	double num1;
	double num2;
	
	public Rectangle(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
		
		
		
	}
//rectangle : length * width;

	public Object calculateArea() {
		// TODO Auto-generated method stub
		return num1*num2;
	}
	
}
