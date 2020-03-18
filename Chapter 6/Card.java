public class Card{
	private String face;
	private String suit;
	private int yit;
	public Card (String cardFace, String cardSuit, int yeet){
		face = cardFace;
		suit = cardSuit;
		yit = yeet;
	}
	public String toString(){
		return face + " of " + suit;
	}
	public int yeet() {
		return yit;
	}
	public int isAce() {
		if (yit==11)
			return (1);
		else
			return(0);
	}
}