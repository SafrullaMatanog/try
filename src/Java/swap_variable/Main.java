package Java.swap_variable;

public class Main {

	public static void main(String[] args) {

		String x = "water";
		String y = "Kool-Aid";
		String temp;

		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}