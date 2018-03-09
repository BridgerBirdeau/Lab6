package Classes;
/******************
 * Bridger Birdeau
 * 3/9/2018
 * Lab6 
 * Creating classes to use for game 
 ******************/
public class Movement {
	private boolean Up; //when user hits 'W' player moves up 
	private boolean Down; //when user hits 'S' player moves down
	private boolean Right; //when user hits 'D' player moves right
	private boolean Left; // when user hits 'A' player moves left
	
	public boolean isUp() {
		return Up;
	}
	public void setUp(boolean up) {
		Up = up;
	}
	public boolean isDown() {
		return Down;
	}
	public void setDown(boolean down) {
		Down = down;
	}
	public boolean isRight() {
		return Right;
	}
	public void setRight(boolean right) {
		Right = right;
	}
	public boolean isLeft() {
		return Left;
	}
	public void setLeft(boolean left) {
		Left = left;
	}
	public String toString() 
	{
		return "This class(Movement) controls movement for the player.";
	}
}
