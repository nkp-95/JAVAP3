package test;

interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000; // 상수필드 선언

	void sendCall(); // 추상메소드

	void receiveCall(); // 추상메소드

	default void printLLogo() {
		System.out.println("***Phone***");// default 메소드
	}

}

class SamsungPhone implements PhoneInterface { // 인터페이스 구현
	// PhoneInterface의 모든 추상 메소드 구현

	public void sendCall() {
		System.out.println("벨소리");
	}

	public void receiveCall() {
		System.out.println("전화가 왔습니다. ");
	}


	// 메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
