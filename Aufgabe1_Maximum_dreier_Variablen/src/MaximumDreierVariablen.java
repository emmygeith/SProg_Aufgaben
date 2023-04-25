import java.util.Scanner;

public class MaximumDreierVariablen {

	public static void main(String[] args) {

		int a, b, c;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gib 3 Zahlen ein: ");

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println("Der maximale Wert ist: " + a);
			}
		} else {
			if (b > c) {
				System.out.println("Der maximale Wert ist: " + b);
			} else {
				System.out.println("Der maximale Wert ist: " + c);
			}

		}

	}

}
