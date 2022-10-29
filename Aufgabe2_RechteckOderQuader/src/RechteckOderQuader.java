import java.util.Scanner;

public class RechteckOderQuader {

	public static void main(String[] args) {
		int RorQ, k1, k2, qk1, qk2, qk3;

		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Willst du Werte eines Rechtecks (1) oder Werte eines Quaders (2) berechnen? Gib 1 oder 2 ein ");
		RorQ = scanner.nextInt();

		// Rechteck
		if (RorQ == 1) {
			System.out.println("Gib zwei Kantenlaengen ein: ");
			k1 = scanner.nextInt();
			k2 = scanner.nextInt();

			System.out.println("Der Flaecheninhalt ist: " + k1 * k2);
			System.out.println("Der Umfang ist: " + (2 * k1 + 2 * k2));

			if (k1 == k2) {
				System.out.println("Es handelt sich um ein Quadrat");
			} else {
				System.out.println("Es handelt sich um kein Quadrat");
			}

		}

		// Quader
		if (RorQ == 2) {
			System.out.println("Gib drei Kantenlaengen ein: ");
			qk1 = scanner.nextInt();
			qk2 = scanner.nextInt();
			qk3 = scanner.nextInt();

			System.out.println("Das Volumen ist: " + qk1 * qk2 * qk3);
			System.out.println("Der Umfang ist: " + 2 * qk1 + 2 * qk2);

			if (qk1 == qk2 && qk2 == qk3) {
				System.out.println("Es handelt sich um einen Wuerfel");
			} else {
				System.out.println("Es handelt sich um keinen Wuerfel");
			}

		}

	}

}
