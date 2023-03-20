/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * */
package by.practice.loop01.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number, sum = 0;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите число: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}
			number = sc.nextInt();
		}

		for (int i = 1; i <= number; i++)
			sum += i;

		System.out.print("Сумма: " + sum);
	}

}
