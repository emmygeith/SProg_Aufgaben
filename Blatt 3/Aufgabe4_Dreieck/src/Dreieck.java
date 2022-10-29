import java.util.Scanner;

public class Dreieck {

	public static void main(String[] args) {
		int a, b;
		double area = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gib zwei Kantenlaengen eines rechtwinkligen Dreiecks ein: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Das war falsch. Gib nochmal zwei Kantenlaengen eines rechtwinkligen Dreiecks ein: ");
			scanner.next();
		}
		System.out.println("Gib zwei Kantenlaengen eines rechtwinkligen Dreiecks ein: ");
		a = scanner.nextInt();
		b = scanner.nextInt();

		area = 0.5 * a * b;
		System.out.println("Der Flaecheninhalt ist: " + area);

	}

}
