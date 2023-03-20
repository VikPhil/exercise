/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 * */
package by.practice.loop06.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int m, n;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите начало промежутка 'm': ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}

			m = sc.nextInt();
			System.out.print("Введите конец промежутка 'n': ");
			n = sc.nextInt();
		}

		for (int i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + ": ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
