package ua.com.qalight.div;

public class div {

	public static void main(String[] args) {

		int a = 764673;
		int b = a;
		int x = 0;
		while (b != 0) {
			x += b % 10;
			b /= 10;
		}

		System.out.println("The sum of " + a + " equals " + x);
	}

}
