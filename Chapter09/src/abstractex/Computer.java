package abstractex;

public abstract class Computer {
	//추상 메서드  한개라도 존재 하면 추상클래스 키워드로 abstract 필요
	//추상 클래스는 상속을 위한 클래스
	public abstract void display(); // {} 없는 메서드 : 추상 메서드
	public abstract void typing();
	
	public void tutnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnoff() {
		System.out.println("DeskTop Typing()");
	}
}
