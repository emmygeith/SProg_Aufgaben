import java.util.Scanner;

public class Pq {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double x1, x2, y;
		int a;

		do {
			System.out.println("Gib einen double Werte ein: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Das war falsch. ");
				System.out.println("Gib nochmal einen double Werte ein: ");
				scanner.next();
			}
			x1 = scanner.nextDouble();

			System.out.println("Gib einen zweiten double Werte ein: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Das war falsch. ");
				System.out.println("Gib nochmal einen double Werte ein: ");
				scanner.next();
			}
			x2 = scanner.nextDouble();

			y = x1 + x2;
			System.out.println("Die Lösung ist: " + y);
			System.out.println("Möchtest du noch eine Rechnung durchführen? Wenn ja drücke '1'");
			a = scanner.nextInt();
		} while (a == 1);

	}

}
