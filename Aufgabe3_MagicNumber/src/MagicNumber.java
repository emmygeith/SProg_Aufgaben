import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		int secretNumber = 126, guess = 0, tries = 1;

		System.out.println("MagicNumber Spiel");

		Scanner scanner = new Scanner(System.in);

		while (guess != secretNumber && guessAgain(scanner) == true) {

			guess = scanner.nextInt();
			if (guess > secretNumber) {
				System.out.println("Zu gross! Rate nochmal: ");
				tries++;
			} else if (guess < secretNumber) {
				System.out.println("Zu klein! Rate nochmal: ");
				tries++;
			}
		}

		if (guess == secretNumber) {
			System.out.println(
					"Richtig! Die geheime Zahl ist " + secretNumber + " Du benötigst " + tries + " Versuch(e).");
		} else {
			System.out.println("Abbruch...Tschüss!");
		}

	}

	public static boolean guessAgain(Scanner s) {
		System.out.println("Bitte eine Zahl raten. Abbruch mit Buchstaben.");
		while (!s.hasNextInt()) {
			return false;
		}
		return true;
	}
}
