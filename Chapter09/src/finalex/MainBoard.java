package finalex;


public class MainBoard {

	public static void main(String[] args) {
		// 테스트 코드(최종 시나리오) 클래스 만들기
		Player player = new Player(); //player는 비기너로 초기화
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
