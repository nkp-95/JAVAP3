package Template;

public class CarTest {

	public static void main(String[] args) {
		//추상클래스와 템플릿 메서드 실습
		System.out.println("====자율주행하는 자동차====");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println();
		System.out.println("====사람이 운전하는 자동차====");
		Car hisCar = new ManualCar();
		hisCar.run();
		
	}

}
