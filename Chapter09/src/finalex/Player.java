package finalex;

import gamelevel.PlayerLevel;

public class Player {
	private Playerlevel level;
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public Playerlevel getlevel() {
		return level;
	}
	public void upgradeLevel(Playerlevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);  
	}

}
