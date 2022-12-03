import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		int guessPlayer1, guessPlayer2 = 0, x = 0;
		/*
		 * final char Player1 = X; final char Player2 = O;
		 */
		Scanner s = new Scanner(System.in);

		System.out.println("TicTacToe Spiel");

		String[][] Field = new String[3][3];
		Field[0][0] = "1";
		Field[0][1] = "2";
		Field[0][2] = "3";

		Field[1][0] = "4";
		Field[1][1] = "5";
		Field[1][2] = "6";

		Field[2][0] = "7";
		Field[2][1] = "8";
		Field[2][2] = "9";

		printArray(Field);
		System.out.println();

		do {
			System.out.println("Spieler 1, bitte geben Sie ihren Zug ein: ");
			guessPlayer1 = readInt();
			markPosition(Field, guessPlayer1, guessPlayer2);

			System.out.println("Spieler 2, bitte geben Sie ihren Zug ein: ");
			guessPlayer2 = readInt();
			markPosition(Field, guessPlayer1, guessPlayer2);

			System.out.println("Spieler 1: " + guessPlayer1 + " Spieler 2: " + guessPlayer2);

			printField(Field);
		} while (x == 0); // Ändern!

	}

	public static void printField(String[][] Field) {
		printArray(Field);
		System.out.println();
	}

	public static void printArray(String a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " & ");
			}
			System.out.println();
		}
	}

	public static int markPosition(String[][] Field, int guessPlayer1, int guessPlayer2) {
		if (guessPlayer1 == 1) {
			Field[0][0] = "X";
		}
		if (guessPlayer2 == 1) {
			Field[0][0] = "O";
		}
		if (guessPlayer1 == 2) {
			Field[0][1] = "X";
		}
		if (guessPlayer2 == 2) {
			Field[0][1] = "O";
		}
		if (guessPlayer1 == 3) {
			Field[0][2] = "X";
		}
		if (guessPlayer2 == 3) {
			Field[0][2] = "O";
		}

		return 0;

	}

	public static int readInt() {
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()) {
			System.out.println("Fehler: Gib nochmal eine Zahl ein: ");
			s.next();
		}
		return s.nextInt();
	}

}
