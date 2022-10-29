import java.util.Scanner;

public class BerechnungEinesAusdrucks {

	public static void main(String[] args) {
	int a, b, c, d, Ergebnis1, Ergebnis2, Ergebnis3, Ergebnis4;
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.println("Gib \"a\" ein: ");
	a = scanner.nextInt();
	
	System.out.println("Gib \"b\" ein: ");
	b = scanner.nextInt();
	
	System.out.println("Gib \"c\" ein: ");
	c = scanner.nextInt();
	
	System.out.println("Gib \"d\" ein: ");
	d = scanner.nextInt();
	
	Ergebnis2 = a * b;
	
	Ergebnis3 = c * d;
	
	Ergebnis1 = Ergebnis2 * Ergebnis3;
	
	System.out.println("a * b * c * d = " +  Ergebnis1);
	
	}

}
