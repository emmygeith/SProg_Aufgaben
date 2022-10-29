import java.util.Scanner;

public class Dreieck2 {

	public static void main(String[] args) {
		int kante1, kante2, area;

		System.out.println("Gib zwei Kantenlaengen eines rechtwinkligen Dreiecks ein: ");
		kante1 = scanPositiveValue("Gib die erste Kantenlaenge ein: ");
		kante2 = scanPositiveValue("Gib die zweite Kantenlaenge ein: ");

		area = kante1 * kante2 / 2;
		System.out.println("Der Flaecheninhalt ist: " + area);

	}

	public static int scanPositiveValue(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		while (!scanner.hasNextInt()) {
			System.out.println("Das war falsch. ");
			System.out.println("Nochmal: " + message);
			scanner.next();
		}
		return Math.abs(scanner.nextInt()); // negative Zahlen abfangen
	}
}

// Wenn man zweimal Kantenlaenge 1 angibt kommt 0 raus, weil von 1/2 der ganzzahlige Anteil null ist. Wegen Datentyp int
