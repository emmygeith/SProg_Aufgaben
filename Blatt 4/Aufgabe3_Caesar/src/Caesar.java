import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String word, encryptedWord = "";
		int number;
		char wordChar;

		System.out.println("Gib ein Wort ein: ");
		/*
		 * while (!scanner.hasNextString()) { System.out.println("Das war falsch. ");
		 * System.out.println("Gib nochmal ein Wort ein"); scanner.next(); }
		 */
		word = scanner.nextLine();

		System.out.println("Gib eine Ganzzahl ein: ");
		while (!scanner.hasNextInt()) {
			System.out.println("Das war falsch. ");
			System.out.println("Gib nochmal eine Ganzzahl ein: ");
			scanner.next();
		}
		number = scanner.nextInt();

		int i = 0;

		while (i < word.length()) {
			wordChar = word.charAt(i);
			i++;
			if (wordChar >= 'a' && wordChar <= 'z') {
				wordChar = (char) (wordChar + number);

				if (wordChar > 'z') {
					wordChar = (char) (wordChar - 'z' + 'a' - 1);
				}
				encryptedWord += wordChar;

			} else if (wordChar >= 'A' && wordChar <= 'Z') {
				wordChar = (char) (wordChar + number);

				if (wordChar > 'Z') {
					wordChar = (char) (wordChar - 'Z' + 'A' - 1);
				}
				encryptedWord += wordChar;
			} else {
				encryptedWord += wordChar;
			}

		}

		System.out.println("Das verschlüsselte Wort ist: " + encryptedWord);
	}

}
