package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		//추ㅏㅇ 클래스 및 템플릿 메서드 실습
		Player playerLim = new Player();
		playerLim.play(1);
		
		//중급자 레벨업 출력
		AdvancedLevel alevel = new AdvancedLevel();  //AdvancedLevel클래스에서 alevel로 넣어줌
		playerLim.upgradeLevel(alevel);//Player클래스 업그레이드로 보내줌
		playerLim.play(2);
		
		//고급 레벨업 출력
		SuperLevel sLevel = new SuperLevel();
		playerLim.upgradeLevel(sLevel);
		playerLim.play(3);
		
		//Player playerLee = new  AdvancedLevel();  //AdvancedLevel();는 PlayerLevel을 넘겨받은것
		Player playerLee = new  Player();             //ㄴ>Player클래스를 받은것이 아님
		playerLee.upgradeLevel(new AdvancedLevel());   //이렇게 해야 가능
	}											  

}
