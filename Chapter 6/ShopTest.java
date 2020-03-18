import java.util.Scanner
public class ShopTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		int cont = 1;
		String item;
		double price;
		int quantity;
		Scanner scan = new Scanner(System.in);
		while (cont == 1) {
			 System.out.println("What item?");
			 item = scan.nextLine();
			 System.out.println("What price?");
			 price = scan.nextDouble();
			 System.out.println("How many?");
			 quantity = scan.nextInt();
			 cart.addToCart(item, price, quantity);
		}
	}
}
