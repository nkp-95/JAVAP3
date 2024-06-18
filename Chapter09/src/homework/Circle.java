package homework;

public class Circle extends ShapeTest {
//circle: Math.PI * radius * radius;
	private double num;
	
	public Circle(double num){
		this.num = num;
	}

	public Object calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * num * num;
	}
}
