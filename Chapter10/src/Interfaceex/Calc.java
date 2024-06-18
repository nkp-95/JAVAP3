package Interfaceex;

/*인터페이스
 * 1. 추상 클래스의 일종
 * 2.추상메서드와 정적 상수만을 멤버로 가질수 있다  jdk7버전까지
 * 모든 메서드 타입: public abstract => 생략가능
 * 모든 변수타입 : public static final=> 생략 가능
 * 3. 인터페이스는 최상위 클래스인 Object 클래스를 상속 받지 않는다.
 * 4.인터페이스는 미완성된 설계도와 같다.
 * 때문에 extends가 아니라 implements로 구현해야된다.
 */

public interface Calc {//interface= 추상메서드
	double PI = 3.14;   //public static final
	int ERROR = -999999999;
	
	//interfaced은 public abstract 생략 가능
	int add(int num1, int num2);  //public abstract int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	//디폴트메서드가 추가 됨으로써
	//인터페이스 메서드 구현된 클래스에서 공통으로 사용가능
	default void description() {
		System.out.println("정수 계산기를 구현 합니다.");
		myuMethod();
	}
	
	static int total(int[]arr) {
		int total = 0;
		for(int i : arr) {
			total = total + i;  // total +=i;
		}
		myStaticMethod();  //정적메서드에서 내부에서 사용하는 메서드 사용
		return total;
	}
	//[private 메서드]
	private void myuMethod() {
		System.out.println("private 메서드입니다.");
	}
	
	//정적메서드에서 내부에서 사용하는 메서드 사용
	//static필요
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다");
	}
}
