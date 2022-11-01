import java.util.Scanner;

public class Craps {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int dice1, dice2;
		
		//Runde 1
		dice1 = (int) (Math.random() *6+1);
		dice2 = (int) (Math.random() *6+1);
		
		System.out.println("Zahl 1 ist: " + dice1);
		System.out.println("Zahl 2 ist: " + dice2);
		
		if (dice1 + dice2 == 7 || dice1 + dice2 == 11) {
			System.out.println("Du hast gewonnen!");
			System.out.println("Moechtest du nocheinmal spielen? Wenn ja drücke '1'");
		} else if (dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) {
			System.out.println("Du hast verloren!");
			System.out.println("Moechtest du nocheinmal spielen? Wenn ja drücke '1'");
		} else {
			System.out.println("Wuerfele noch einmal!");
		}
		
		//Runde 2
		
			
		System.out.println("Der Punktestand ist: ");
		dice1 = (int) (Math.random() *6+1);
		dice2 = (int) (Math.random() *6+1);
		
		System.out.println("Zahl 1 ist: " + dice1);
		System.out.println("Zahl 2 ist: " + dice2);
		
		if (dice1 == 7 || dice2 == 7) {
			System.out.println("Du hast verloren!");
			System.out.println("Moechtest du nocheinmal spielen? Wenn ja drücke '1'");
		} else if (dice1 == dice2) {
			System.out.println("Du hast gewonnen!");
			System.out.println("Moechtest du nocheinmal spielen? Wenn ja drücke '1'");
		} else {
			System.out.println("Wuerfele nochmal!");
		}	
		
		
		
	}

}
