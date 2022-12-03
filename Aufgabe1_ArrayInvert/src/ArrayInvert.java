import java.util.Scanner;

public class ArrayInvert {

	public static void main(String[] args) {
		int numberElements;

		System.out.println("Wieviele Elemente wollen sie eingeben? ");

		numberElements = readInt();

		while (numberElements <= 0) {
			System.out.println("Fehler: Gib nochmal eine Zahl ein: ");
			numberElements = readInt();
		}

		System.out.println("Bitte geben sie " + numberElements + " Elemente an: ");

		int[] Array1 = new int[numberElements];
		for (int i = 0; i < numberElements; i++) {
			Array1[i] = readInt();
		}

		int[] Array2 = Array1.clone();
		for (int i = 0; i < numberElements; i++) {
			Array2[i] = -Array2[i];
		}

		System.out.println("Array 1: ");
		printArray(Array1);

		System.out.println("Array 2: ");
		printArray(Array2);
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
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
