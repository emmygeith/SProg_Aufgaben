import java.util.Scanner;

public class Craps {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int dice1, dice2, scorePlayer = 0, scoreComputer = 0, x = 0, y = 0, z = 0;

		// Runde 1
		System.out.println("Zum wuerfeln drücke '1'");
		x = scanner.nextInt();

		do {
			if (x == 1) {
				dice1 = (int) (Math.random() * 6 + 1);
				dice2 = (int) (Math.random() * 6 + 1);

				System.out.println("Zahl 1 ist: " + dice1);
				System.out.println("Zahl 2 ist: " + dice2);
				System.out.println("Spieler: " + scorePlayer + " Computer: " + scoreComputer);

				if (dice1 + dice2 == 7 || dice1 + dice2 == 11) {
					System.out.println("Du hast gewonnen!");
					System.out.println("Moechtest du nocheinmal spielen? Wenn ja drücke '1'");
					scorePlayer = scorePlayer + 1;
				} else if (dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) {
					System.out.println("Du hast verloren!");
					System.out.println("Moechtest du nocheinmal spielen? Wenn ja drücke '1'");
					scoreComputer = scoreComputer + 1;
				} else {
					System.out.println("Wuerfele noch einmal!");
				}
			}

			// Runde 2
			System.out.println("Zum wuerfeln drücke '1'");
			x = scanner.nextInt();
			while (x == 1) {
				System.out.println("Der Punktestand ist: ");
				dice1 = (int) (Math.random() * 6 + 1);
				dice2 = (int) (Math.random() * 6 + 1);

				System.out.println("Zahl 1 ist: " + dice1);
				System.out.println("Zahl 2 ist: " + dice2);
				System.out.println("Spieler: " + scorePlayer + " Computer: " + scoreComputer);

				if (dice1 == 7 || dice2 == 7) {
					System.out.println("Du hast verloren!");
					System.out.println("Moechtest du nocheinmal spielen? Wenn ja drücke '1'");
					scoreComputer = scoreComputer + 1;
					y = scanner.nextInt();
				} else if (dice1 == dice2) {
					System.out.println("Du hast gewonnen!");
					System.out.println("Moechtest du nocheinmal spielen? Wenn ja drücke '1'");
					scorePlayer = scorePlayer + 1;
					y = scanner.nextInt();
				} else {
					System.out.println("Wuerfele nochmal!");
					z = 1;
				}
			}

		} while (y == 1);

	}

}
