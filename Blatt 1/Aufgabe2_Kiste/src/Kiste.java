import java.util.Scanner;

public class Kiste {

	public static void main(String[] args) {
		float l, b, h, volumen, oberflaeche, kantenlaenge;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Laenge der Kiste: ");
		l = scanner.nextFloat();

		System.out.println("Breite der Kiste: ");
		b = scanner.nextFloat();

		System.out.println("Hoehe der Kiste: ");
		h = scanner.nextFloat();

		volumen = l * b * h;
		oberflaeche = 2 * (l * h + l * b + b * h);
		kantenlaenge = 4 * (l + b + h);

		System.out.println("Volumen: " + volumen);
		System.out.println("Oberflaeche: " + oberflaeche);
		System.out.println("Kantenl�nge: " + kantenlaenge);
	}

}
