
public class Testat {

	public static void main(String[] args) {


		int i = 0, x = 0;
		for (i = 2 ;i<=1000; i++) {
			if (i%3==0 && i%5==0) {
				x = x + i;
		}
		
	}
		System.out.println(x);

}
}

