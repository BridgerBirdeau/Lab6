package Classes;
/******************
 * Bridger Birdeau
 * 3/9/2018
 * Lab6 
 * Creating classes to use for game 
 ******************/
public class Enemy {
	private boolean FollowPlayer; //enemy moves to players position
	private boolean EatPlayer; //when enemy collides with player, player dies
	private String Image; //ImagePath to the image of the enemy
	
	public boolean isFollowPlayer() {
		return FollowPlayer;
	}
	public void setFollowPlayer(boolean followPlayer) {
		FollowPlayer = followPlayer;
	}
	public boolean isEatPlayer() {
		return EatPlayer;
	}
	public void setEatPlayer(boolean eatPlayer) {
		EatPlayer = eatPlayer;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String toString() 
	{
		return "This class(Enemy) controls the enemy funtion on sending it to the players position, image-path for the "
				+ "enemy, and eating player went player and enemy collide.";
	}
}
