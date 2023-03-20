/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 * */
package by.practice.branch04.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A, B;
		int x, y, z;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите размеры прямоугольного отверстия 'A': ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}
			A = sc.nextInt();
			System.out.print("Введите прямоугольного размеры отверстия 'B': ");
			B = sc.nextInt();
			System.out.print("Введите размеры кирпича 'x': ");
			x = sc.nextInt();
			System.out.print("Введите размеры кирпича 'y': ");
			y = sc.nextInt();
			System.out.print("Введите размеры кирпича 'z': ");
			z = sc.nextInt();
		}
		
		if((x < A && y < B) || (x < A && z < B) || (y < A && x < B) ||
		   (y < A && z < B) || (z < A && x < A) || (z < A && y < B))
			System.out.print("Кирпичь пройдет в заданный прямоугольник.");
		else
			System.out.print("Кирпичь не пройдет в заданный прямоугольник.");

	}

}
