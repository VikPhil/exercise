/*									 x^2 - 3x + 9, если x<=3;
 * Вычислить значение функции: F(x)=	1
 * 									 -------,      если x > 3.
 * 									 x^3 + 6
 * */
package by.practice.branch05.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double x, F = 0.0;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите 'x': ");
			while (!sc.hasNextDouble()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}
			x = sc.nextDouble();
		}
		if (x <= 3)
			F = Math.pow(x, 2) - 3 * x + 9;
		else if (x > 3)
			F = 1 / Math.pow(x, 3) + 6;

		System.out.print("F(x) = " + F);
	}

}
