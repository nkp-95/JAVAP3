package Interfaceex;

public class CompleteClac extends Claculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}else {
			return Calc.ERROR; //num2 나누는수가 0인경우 오류반환 
		}
		
	}
	
	public void showInfo() {
		System.out.println("Clac 인터페이스를 구현하였습니다.");
	}
	@Override
	public void description() {
		// TODO Auto-generated method stub
		super.description();
	}
}
