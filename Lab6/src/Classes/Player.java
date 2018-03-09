package Classes;
/******************
 * Bridger Birdeau
 * 3/9/2018
 * Lab6 
 * Creating classes to use for game 
 ******************/
public class Player {
	private String Name; //Gets name for player
	private String Image; //ImagePath to character image
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String toString() 
	{
		return "This class(Player) controls the setting of the player name and contains the image path for the player.";
	}

}
