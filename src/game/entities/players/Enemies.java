package game.entities.players;

import game.rules.info.Info;
import game.rules.info.PlayerInfo;

public class Enemies {
	Player leftEnemy;
	Player rightEnemy;
	
	public Enemies(Player leftEnemy, Player rightEnemy) {
		this.leftEnemy = leftEnemy;
		this.rightEnemy = rightEnemy;
	}
	
	public Player getLeftEnemy() {
		return leftEnemy;
	}
	
	public Player getRightEnemy() {
		return rightEnemy;
	}
	
	public PlayerInfo[] getEnemiesInfo(){
		PlayerInfo[] enemiesInfo = new PlayerInfo[2];
		enemiesInfo[0] = (PlayerInfo) leftEnemy.getInfo();
		enemiesInfo[1] = (PlayerInfo) rightEnemy.getInfo();
		
		return enemiesInfo;
	}
}
