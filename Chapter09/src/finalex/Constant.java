package finalex;

public class Constant {
	//멤버변수
	int num = 10;
	final int NUM = 100;  //상수 선언 및 초기화

	public static void main(String[] args) {
		final int NUM1;//지역변수
		NUM1 = 200;   //지역 변수에선 처음 선언만 가능
//		Num1 = 300;  //오류
		//final 실습
		Constant constant = new Constant();
		constant.num = 50;
		//constant.NUM = 200;  //상수이기 때문에 불가능, (오류)
		
	}

}
