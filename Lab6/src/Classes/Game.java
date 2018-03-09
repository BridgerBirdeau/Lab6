package Classes;

import java.awt.Panel;

/******************
 * Bridger Birdeau
 * 3/9/2018
 * Lab6 
 * Creating classes to use for game 
 ******************/
public class Game {
	private int Score;  //collects score value
	private Panel MenuScreen; //hold main menu panel
	private Panel GameScreen; //hold game menu panel
	private Panel GameOverScreen; //hold game over panel
	
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public Panel getMenuScreen() {
		return MenuScreen;
	}
	public void setMenuScreen(Panel menuScreen) {
		MenuScreen = menuScreen;
	}
	public Panel getGameScreen() {
		return GameScreen;
	}
	public void setGameScreen(Panel gameScreen) {
		GameScreen = gameScreen;
	}
	public Panel getGameOverScreen() {
		return GameOverScreen;
	}
	public void setGameOverScreen(Panel gameOverScreen) {
		GameOverScreen = gameOverScreen;
	}
	public String toString() 
	{
		return "This class(Game) contains the player score, and handles the game menu panel, the game panel, and the game"
				+ "over panel.";
	}
	
}
