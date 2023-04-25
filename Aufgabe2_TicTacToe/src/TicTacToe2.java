import java.util.Scanner;

public class TicTacToe2 {

	public static void main(String[] args) {
		int guessPlayer1, guessPlayer2 = 0;

		System.out.println("TicTacToe Spiel");

		String[] field = new String[9];
		for (int i = 0; i < field.length; i++) {
			field[i] = "" + (i + 1);
		}

		do {
			printArray(field);

			guessPlayer1 = getInput(field, "Spieler 1, bitte geben sie Ihren Zug ein: ");
			markPosition(field, guessPlayer1, "X");

			printArray(field);

			guessPlayer2 = getInput(field, "Spieler 2, bitte geben sie Ihren Zug ein: ");
			markPosition(field, guessPlayer2, "O");
		} while (!isArrayFull(field));
		System.out.println("Spiel vorbei.");
	}

	public static void printArray(String a[]) {
		for (int i = 0; i < 3; i++) {
			System.out.print(a[i] + " & ");
		}
		System.out.println();
		for (int i = 3; i < 6; i++) {
			System.out.print(a[i] + " & ");
		}
		System.out.println();
		for (int i = 6; i < 9; i++) {
			System.out.print(a[i] + " & ");
		}
		System.out.println();
		System.out.println();
	}

	public static void printField(String[] field) {
		printArray(field);
		System.out.println();
	}

	public static int getInput(String[] field, String message) {
		int position = 0;
		boolean isFieldFree = false;
		do {
			System.out.println(message);
			position = readInt();
			isFieldFree = isLegalIndex(field, position - 1);
			if (!isFieldFree) {
				System.out.println("Illegale Eingabe.");
			}
		} while (!isFieldFree);
		return position;
	}

	public static int readInt() {
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()) {
			System.out.println("Fehler: Gib nochmal eine Zahl ein: ");
			s.next();
		}
		return s.nextInt();
	}

	/**
	 * @param field
	 * @param position
	 * @return returns true wenn das Feld an "position" frei ist. position muss
	 *         zwischen 1-9 sein
	 */
	public static boolean isFieldFree(String[] field, int position) {
		if (!isLegalIndex(field, position - 1)) {
			return false;
		}
		String currentValue = field[position - 1];
		return !currentValue.equals("X") && !currentValue.equals("O");
	}

	// prüft ob der Index [i] legal ist (also zwischen 0 und 8)
	public static boolean isLegalIndex(String[] field, int index) {
		return index < field.length && index >= 0;
	}

	// Kann nur Position markieren wenn boolean "isFieldFree" true ist und boolean
	// "isLegalIndex" true ist
	public static void markPosition(String[] field, int position, String mark) {
		if (isFieldFree(field, position)) {
			field[position - 1] = mark;
		} else {
			System.out.println("Markierung nicht möglich. Feld ist schon belegt.");
		}
	}

	// prüft ob das Spielfeld voll ist (Bedingung für do while Schleife s.o.)
	public static boolean isArrayFull(String[] field) {
		for (int i = 0; i < field.length; i++) {
			if (isFieldFree(field, i + 1)) {
				return false;
			}
		}
		return true;
	}

}
