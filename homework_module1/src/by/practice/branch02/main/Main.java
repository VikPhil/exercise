/*
 * Найти max{min(a, b), min(c, d)}.
 * */
package by.practice.branch02.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a, b, c, d;
		int max;

		max = 0;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите 'a': ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}

			a = sc.nextInt();
			System.out.print("Введите 'b': ");
			b = sc.nextInt();
			System.out.print("Введите 'c': ");
			c = sc.nextInt();
			System.out.print("Введите 'd': ");
			d = sc.nextInt();
		}

		if (a > b)
			a = b;
		if (c > d)
			c = d;

		if (a > c)
			max = a;
		else
			max = c;

		System.out.print("max = " + max);

	}

}
