/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
 * расположены на одной прямой.
 * */
package by.practice.branch03.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x1, x2, x3;
		int y1, y2, y3;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("1)Введите 'x' и 'y' через пробел: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}
			x1 = sc.nextInt();
			y1 = sc.nextInt();

			System.out.print("2)Введите 'x' и 'y' через пробел: ");
			x2 = sc.nextInt();
			y2 = sc.nextInt();

			System.out.print("3)Введите 'x' и 'y' через пробел: ");
			x3 = sc.nextInt();
			y3 = sc.nextInt();

		}

		if ((x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1) == 0)
			System.out.println("Эти точки лежат на одной прямой:");
		else
			System.out.println("Эти точки не лежат на одной прямой:");

		System.out.print("1)[" + x1 + " " + y1 + "]");
		System.out.print(" 2)[" + x2 + " " + y2 + "]");
		System.out.print(" 3)[" + x3 + " " + y3 + "]");
	}

}
