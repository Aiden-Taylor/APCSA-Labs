import java.util.Scanner;
public class NameTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the name of person #1 (first middle last):");
		Name name1 = new Name(scan.next(), scan.next(), scan.next());
		System.out.println("Please enter the name of person #2 (first middle last):");
		Name name2 = new Name(scan.next(), scan.next(), scan.next());
		System.out.println(name1.firstMiddleLast());
		System.out.println(name1.lastFirstMiddle());
		System.out.println(name1.initials());
		System.out.println("The name length is " + name1.length());
		System.out.println();
		System.out.println(name2.firstMiddleLast());
		System.out.println(name2.lastFirstMiddle());
		System.out.println(name2.initials());
		System.out.println("The name length is " + name2.length());
		System.out.println();
		if (name1.equals(name2)) {
			System.out.println("The names are the same");
		}
		else {
			System.out.println("The names are unique");
		}
	}
}
