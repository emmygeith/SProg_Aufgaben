import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		int sum = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gib eine Kantenlaenge eines Polygons  an (oder 'e' zum beenden): ");
		
		while(scanner.hasNextInt()) {
			System.out.println("Gib eine Kantenlaenge eines Polygons  an (oder 'e' zum beenden): ");
			int x = scanner.nextInt();
			sum = sum + x;
			
		}
		
		System.out.println("Der Umfang betraegt: " + sum );

		
	}

}
