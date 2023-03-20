/*															  x,x>2
 * Вычислить значения функции на отрезке [а,b] c шагом h: y = 
 * 															  -x,x<=2
 * */
package by.practice.loop02.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a, b, h, y = 0;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите начало отрезка 'a': ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}

			a = sc.nextInt();
			System.out.print("Введите конец отрезка 'b': ");
			b = sc.nextInt();
			System.out.print("Введите шаг 'h': ");
			h = sc.nextInt();
		}

		System.out.print("Значения функции на отрезке [" + a + "," + b + "]: ");
		for (int i = a; i <= b; i += h) {
			if (i > 2)
				y = i;
			else if (i <= 2)
				y = -i;

			System.out.print(y + ", ");
		}
	}

}
