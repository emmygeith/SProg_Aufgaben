import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		int year;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gib eine Jahreszahl ein: ");
		year = scanner.nextInt();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Es handelt sich dabei um ein Schaltjahr");
		} else {
			if (year % 400 == 0) {
				System.out.println("Es handelt sich dabei um ein Schaltjahr");
			} else {
				System.out.println("Es handelt sich dabei um kein Schaltjahr");
			}

		}

	}

}
