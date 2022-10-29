import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		int a, b, x;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Gib 2 Zahlen ein: ");
			a = scanner.nextInt();
			b = scanner.nextInt();

			if (a > 21 && b > 21) {
				System.out.println("Leider sind beide Zahlen groesser 21, es gewinnt die Bank!");
			} else if (a == b) {
				System.out.println("Die Zahlen sind gleich, bitte spielen Sie noch einmal");
			} else if (a <= 21 && b <= 21) {
				if (a > b) {
					System.out.println(a + " ist dichter an der 21");
				} else {
					System.out.println(b + " ist dichter an der 21");
				}
			} else if ((a <= 21 && b > 21) || (a > 21 && b <= 21)) {
				System.out.println("falsche Eingabe");
			}
			System.out.println("Moechtest du noch eine Runde spielen? Wenn ja druecke '1'");
			x = scanner.nextInt();
		} while (x == 1);
	}

}
