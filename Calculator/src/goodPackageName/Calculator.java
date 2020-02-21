package goodPackageName;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y;
		System.out.println("first number x:");
		x = scanner.nextInt();
		System.out.println("second number y:");
		y = scanner.nextInt();

		int z = x + y;
		System.out.println("x + y = " + z);

	}

}
