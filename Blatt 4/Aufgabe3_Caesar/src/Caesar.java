import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String word;
		int number;

		System.out.println("Gib ein Wort ein: ");
		/*
		 * while (!scanner.hasNextString()) { System.out.println("Das war falsch. ");
		 * System.out.println("Gib nochmal ein Wort ein"); scanner.next(); }
		 */
		word = scanner.next();

		System.out.println("Gib eine Ganzzahl ein: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Das war falsch. ");
			System.out.println("Gib nochmal eine Ganzzahl ein: ");
			scanner.next();
		}
		number = scanner.nextInt();

		int length = word.length();
		int counter = 0;

		while (counter < length) {

		}

		System.out.println("Das verschlüsselte Wort ist:" + word);
	}

}
