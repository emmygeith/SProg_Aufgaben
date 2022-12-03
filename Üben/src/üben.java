import java.util.Scanner;

public class üben {

	public static void main(String[] args) {
		int x;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe einen Integer ein: ");
		
		while(!scanner.hasNextInt()) {
			System.out.println("Das war falsch, gib nochmal einen Integer ein: ");
			scanner.next();
		}
		x = scanner.nextInt();

		if (x%5==0 && x%7==0) {
			System.out.println("Es ist ein mehrfaches von 5 und 7");
		} else {
			System.out.println("Es ist kein mehrfaches von 5 und 7");
		}
		
	}

}
