import java.util.Scanner;

public class EinmalEins {

	public static void main(String[] args) {
		int n = readInt("Gib eine Zahl ein, um eine Einmaleinstabelle zu erstellen: ");
		drawEinxEins(n);

	}

	public static int readInt(String message) {
		System.out.println(message);
		Scanner s = new Scanner(System.in);
		while (!s.hasNextInt()) {
			System.out.println("Fehler: Gib nochmal eine Zahl ein: ");
			s.next();
		}
		return s.nextInt();
	}

	public static void drawEinxEins(int n) {
		for (int i = 1; i <= n; i++) {
			drawTableLine(i);
		}
	}

	public static void drawTableLine(int zahl) {
		for (int i = 1; i <= 10; i++) {
			int product = zahl * i;
			System.out.print(product + " ");
		}
		System.out.println();
	}
}
