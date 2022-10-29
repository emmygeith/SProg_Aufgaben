import java.util.Scanner;
import java.lang.Math.*;



/* Quellen: https://linuxhint.com/use-pi-in-java/ 
 * https://study.com/academy/lesson/how-to-use-pi-constant-in-java.html
 * https://de.comp.lang.java.narkive.com/XYRuUDxt/potenzen-in-java
 */
public class Kugel {

	public static void main(String[] args) {
	double d, radius, volumen, rhoch3;
	final double PI = 3.14159265358979323846;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Durchmesser der Kugel: ");
	d = scanner.nextDouble();
	
	radius = d/2;
	
	rhoch3  = Math.pow(radius, 3);
	
	//  V = 4/3 * PI + r^3 = 4 * PI/3 * r^3
	
	volumen = 4 * Math.PI/3 * rhoch3;
	
	System.out.println("Volumen der Kugel: " + volumen);

	}

}
