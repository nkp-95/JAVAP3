package gamelevel;

public class Player {
//멤버 변수 
	private PlayerLevel level; //참조변수
	
	public Player() {  //디폴트 생성자 : 초급자 레벨로 시작
		level = new  BeginnerLevel();  //A a = new A 초기화
		//PlayerLevel level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public PlayerLevel getLevel() {
		return level;
	}

	//셋터: 레벨 변경 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		//PlayerLevel level = new AdvancedLevel();
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);  //템플릿 메서드
	}
	
}
