package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// 추상클래스는 인스턴스 생성불가 테스트
		//Computer c1 = new Computer();//인스턴스 불가
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook();//노트북도 추상 클래스기때문에 불가
		Computer c4 = new MyNoteBook();

	}

}
