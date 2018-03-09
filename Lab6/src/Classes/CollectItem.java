package Classes;
/******************
 * Bridger Birdeau
 * 3/9/2018
 * Lab6 
 * Creating classes to use for game 
 ******************/
public class CollectItem {
	private String Image; //ImagePath to the image of the collected item
	private boolean ItemCollect; //every time player collides with CollectItem the players score goes up by 1 point
	
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public boolean isItemCollect() {
		return ItemCollect;
	}
	public void setItemCollect(boolean itemCollect) {
		ItemCollect = itemCollect;
	}
	public String toString() 
	{
		return "This class(CollectItem) controls the collecting of items and adding to the player score.";
	}

}
