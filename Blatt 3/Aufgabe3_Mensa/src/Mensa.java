import java.util.Scanner;

public class Mensa {

	public static void main(String[] args) {
		double balance = 0, expense;

		Scanner scanner = new Scanner(System.in);

		while (balance <= 0) {
			System.out.println("Gib dein Guthaben ein: ");
			while (!scanner.hasNextDouble()) {
				System.out.println("Das war falsch. ");
				System.out.println("Gib nochmal ein: ");
				scanner.next();
			}
			balance = scanner.nextDouble();
			if (balance <= 0) {
				System.out.println("Sie haben kein Guthaben mehr.");
			}
		}

		System.out.println("Gib deine Ausgabe ein oder einen Buchstaben um abzubrechen: ");

		while (balance > 0 && scanner.hasNextDouble()) {

			expense = scanner.nextDouble();
			balance = balance - expense;

			if (balance < 0) {
				System.out.println("Du hast kein Guthaben mehr");
			} else {
				System.out.println("Dein verbleibendes Guthaben ist: " + balance);
				System.out.println("Gib deine Ausgabe ein: ");
			}
		}

	}

}
