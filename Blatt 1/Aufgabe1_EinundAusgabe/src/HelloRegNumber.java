import java.util.Scanner;


//Aufgabe 1 Ein- und Ausgabe
public class HelloRegNumber {

	public static void main(String[] args) {
		int matrikel;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gib deine Matrikelnummer ein: ");
		matrikel = scanner.nextInt();
		
		System.out.println("Hallo " + matrikel);
	}

}
