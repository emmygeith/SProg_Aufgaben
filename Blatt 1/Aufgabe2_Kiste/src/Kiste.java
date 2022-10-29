import java.util.Scanner;

public class Kiste {

	public static void main(String[] args) {
	float l, b, h, volumen, oberfläche, kantenlänge;

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Länge der Kiste: ");
	l = scanner.nextFloat();
	
	System.out.println("Breite der Kiste: ");
	b = scanner.nextFloat();
	
	System.out.println("Höhe der Kiste: ");
	h = scanner.nextFloat();
	
	volumen = l * b * h ;
	oberfläche = 2*(l*h+l*b+b*h);
	kantenlänge = 4*(l+b+h);
	
	System.out.println("Volumen: " + volumen);
	System.out.println("Oberfläche: " + oberfläche);
	System.out.println("Kantenlänge: " + kantenlänge);
	}

}
