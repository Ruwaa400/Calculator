package goodPackageName;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;

		System.out.println("first number x:");
		x = 10;// scanner.nextInt();

		System.out.println("second number y:");
		y = 10;// scanner.nextInt();

		int z = add(x, y);
		System.out.println("x + y = " + z);

	}

	public static int add(int x, int y) {
		return x + y;
	}

}
