package Interfaceex;

public abstract class Claculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		
		return num1 - num2;
	}

	//times, divide 추상메서드

}
