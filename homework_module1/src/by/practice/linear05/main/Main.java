/*
 * Дано натуральное число Т, которое представляет длительность прошедшего
 * времени в секундах. Вывести данное значение длительности в часах,
 * минутах и секундах в следующей форме: ННч ММмин SSc.
 * */
package by.practice.linear05.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number, h, m, s;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите целое число: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}
			number = sc.nextInt();
		}

		h = number / 3600;
		m = (number / 60) % 60;
		s = number % 60;

		System.out.printf("%02dч %02dмин %02dс", h, m, s);

	}

}
