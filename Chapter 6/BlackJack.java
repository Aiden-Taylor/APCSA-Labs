import java.util.Scanner;
public class BlackJack {
	public static void main(String[] args) {
		int bruh;
		int temp;
		String Winner = "yeet";
		String yeeeeeeeet;
		int isace;
		Card nigeria;
		Scanner scan = new Scanner(System.in);
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle();
		System.out.println("How many Players?");
		int Players[];
		Players = new int [scan.nextInt()];
		for (int i = 0; i < Players.length; i++) {
			bruh = 0;
			isace = 0;
			System.out.println("Player " + (i+1));
			nigeria = deck.dealCard();
			System.out.println("You were dealt: " + nigeria);
			Players[i] += nigeria.yeet();
			isace += nigeria.isAce();
			nigeria = deck.dealCard();
			System.out.println("You were dealt: " + nigeria);
			Players[i] += nigeria.yeet();
			isace += nigeria.isAce();
			while (bruh == 0) {
				System.out.println("Hit? (y/n)");
				yeeeeeeeet = scan.next();
				if (yeeeeeeeet.toUpperCase().equals("Y") && Players[i] <= 21) {
					nigeria = deck.dealCard();
					System.out.println("You were dealt: " + nigeria);
					Players[i] += nigeria.yeet();
					isace += nigeria.isAce();
					for (int n = isace; n>0; n--) {
						if (Players[i] > 21 && isace>0) {
							Players[i] -= 10;
						}
					}
					if (Players[i]>21) {
						System.out.println("Bust!");
						bruh = 1;
					}
				}
				else
					bruh = 1;
			}
		}
		int max = 1;
		for (int fuck = 0; fuck < Players.length; fuck++) {
			temp = Players[fuck];
			if (temp>21) {
				temp = 0;
			}
			if (temp>max) {
				max = temp;
				Winner = "Player " + (1+fuck) + " wins!";
			}
		if (max == 1)
			Winner = "everyone sucks eat shit";
		}
		System.out.println(Winner);
		for (int ieet = 0; ieet < Players.length; ieet++) {
			System.out.println("Player " + (1+ieet) + "\'s score: " + Players[ieet]);
		}
	}
}