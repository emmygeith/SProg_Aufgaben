import java.util.Scanner;

public class Kiste {

	public static void main(String[] args) {
	float l, b, h, volumen, oberfl�che, kantenl�nge;

	Scanner scanner = new Scanner(System.in);
	
	System.out.println("L�nge der Kiste: ");
	l = scanner.nextFloat();
	
	System.out.println("Breite der Kiste: ");
	b = scanner.nextFloat();
	
	System.out.println("H�he der Kiste: ");
	h = scanner.nextFloat();
	
	volumen = l * b * h ;
	oberfl�che = 2*(l*h+l*b+b*h);
	kantenl�nge = 4*(l+b+h);
	
	System.out.println("Volumen: " + volumen);
	System.out.println("Oberfl�che: " + oberfl�che);
	System.out.println("Kantenl�nge: " + kantenl�nge);
	}

}
