/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 * */
package by.practice.branch01.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int angle1, angle2;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите координату первый угол: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}

			angle1 = sc.nextInt();
			System.out.print("Введите второй угол: ");
			angle2 = sc.nextInt();
		}

		if (angle1 + angle2 < 180) {
			System.out.println("Треугольник существует.");

			if (angle1 == 90 || angle2 == 90 || (angle1 + angle2 == 90)) {
				System.out.print("Прямоугольный треугольник.");
			} else
				System.out.println("Он не является прямоугольным.");

		} else
			System.out.print("Это не треугольник");

	}

}
