import java.util.Scanner;

public class Fakultät {

	public static void main(String[] args) {
		int n, factorialResult;

		Scanner s = new Scanner(System.in);

		System.out.println("Gib eine Zahl zum Berechnen der Fakultät ein: ");
		while (!s.hasNextInt()) {
			System.out.println("Fehler: Gib nochmal eine Zahl ein: ");
			s.next();
		}
		n = s.nextInt();

		factorialResult = calculateFactorial(n);
		System.out.println(factorialResult);
	}

	public static int calculateFactorial(int n) {
		int factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
