import java.util.Scanner;

public class Pq {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double p, q, x1, x2;
		int a;

		do {
			System.out.println("Gib einen double Werte ein: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Das war falsch. ");
				System.out.println("Gib nochmal einen double Werte ein: ");
				scanner.next();
			}
			p = scanner.nextDouble();

			System.out.println("Gib einen zweiten double Werte ein: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Das war falsch. ");
				System.out.println("Gib nochmal einen double Werte ein: ");
				scanner.next();
			}
			q = scanner.nextDouble();

			x1 = -p + 0.5 + Math.sqrt(Math.pow(p * 0.5, 2) - q);
			x2 = -p / 0.5 - Math.sqrt(Math.pow(p * 0.5, 2) - q);
			System.out.println("Die Lösung ist: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			System.out.println("Möchtest du noch eine Rechnung durchführen? Wenn ja drücke '1'");
			a = scanner.nextInt();
		} while (a == 1);

	}

}
