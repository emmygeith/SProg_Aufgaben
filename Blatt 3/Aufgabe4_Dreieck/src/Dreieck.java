import java.util.Scanner;

public class Dreieck {

	public static void main(String[] args) {
		int a, b, area;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gib zwei Kantenlaengen eines rechtwinkligen Dreiecks ein: ");
		System.out.println("Gib die erste Kantenlaenge ein: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Das war falsch. ");
			System.out.println("Gib nochmal die erste Kantenlaenge ein: ");
			scanner.next();
		}
		a = scanner.nextInt();
		a = Math.abs(a); // negative Zahlen abfangen

		System.out.println("Gib die zweite Kantenlaenge ein: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Das war falsch. ");
			System.out.println("Gib nochmal die zweite Kantenlaenge ein: ");
			scanner.next();
		}
		b = scanner.nextInt();
		b = Math.abs(b); // negative Zahlen abfangen
		area = a * b / 2;
		System.out.println("Der Flaecheninhalt ist: " + area);

	}

}

// Wenn man zweimal Kantenlaenge 1 angibt kommt 0 raus, weil von 1/2 der ganzzahlige Anteil null ist. Wegen Datentyp int
