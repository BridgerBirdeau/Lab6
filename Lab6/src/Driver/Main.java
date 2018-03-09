package Driver;

import Classes.CollectItem;
import Classes.Enemy;
import Classes.Game;
import Classes.Movement;
import Classes.Player;
/******************
 * Bridger Birdeau
 * 3/9/2018
 * Lab6 
 * Creating classes to use for game 
 ******************/
public class Main {
	//Calling toString for all classes
	public static void main(String[] args) {
		Game myGame = new Game();
		Player myPlayer = new Player();
		Movement movement = new Movement();
		Enemy myEnemy = new Enemy();
		CollectItem collectItem = new CollectItem();
		
		System.out.println(myGame.toString());
		System.out.println(myPlayer.toString());
		System.out.println(movement.toString());
		System.out.println(myEnemy.toString());
		System.out.println(collectItem.toString());
	}

}
