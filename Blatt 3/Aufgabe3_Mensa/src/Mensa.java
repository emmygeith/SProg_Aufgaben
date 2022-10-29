import java.util.Scanner;

public class Mensa {

	public static void main(String[] args) {
		int balance, expense, newbalance = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gib dein Guthaben ein: ");
		balance = scanner.nextInt();

		System.out.println("Gib deine Ausgabe ein: ");

		while (scanner.hasNextInt() && balance > 0) {

			System.out.println("Gib deine Ausgabe ein: ");
			expense = scanner.nextInt();
			newbalance = balance - expense;

			System.out.println("Dein verbleibendes Guthaben ist: " + newbalance);
		}

	}

}
