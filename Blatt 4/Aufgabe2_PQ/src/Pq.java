import java.util.Scanner;

public class Pq {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double p, q, x1, x2;
		String a;

		do {
			System.out.println("P-Q Gleichungsrechner");
			System.out.println("Gib einen double Wert für 'p' ein: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Das war falsch. ");
				System.out.println("Gib nochmal 'p' ein: ");
				scanner.next();
			}
			p = scanner.nextDouble();

			System.out.println("Gib einen double Wert für 'q' ein: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Das war falsch. ");
				System.out.println("Gib nochmal 'q' ein: ");
				scanner.next();
			}
			q = scanner.nextDouble();

			x1 = -p / 2d + Math.sqrt(Math.pow(p / 2d, 2) - q);
			x2 = -p / 2d - Math.sqrt(Math.pow(p / 2d, 2) - q);

			if (Double.isNaN(x1) || Double.isNaN(x2)) {
				System.out.println("Diese Gleichung hat keine Lösung ");
			} else

				System.out.println("Die Lösung ist: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			System.out.println("Möchtest du noch eine Rechnung durchführen? Wenn ja drücke '1'");
			a = scanner.next();
		} while (a.equals("1"));

	}

}
