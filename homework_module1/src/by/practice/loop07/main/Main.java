/*
 * Даны два числа. Определить цифры, входящие в запись как первого так 
 * и второго числа.(part 1)
 * */
package by.practice.loop07.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int number1, number2;
		int[] arrNum1, arrNum2;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите первое число: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}

			number1 = sc.nextInt();
			System.out.print("Введите второе число: ");
			number2 = sc.nextInt();
		}

		arrNum1 = new int[arrCount(number1)];
		putArray(arrNum1, number1); // Заполняем массив

		arrNum2 = new int[arrCount(number2)];
		putArray(arrNum2, number2);
		
		System.out.print("Цифры входящие в запись двух чисел: ");

		if (arrNum1.length >= arrNum2.length) {
			for (int i = 0; i < arrNum2.length; i++)
				for (int j = 0; j < arrNum1.length; j++) {
					if (arrNum2[i] == arrNum1[j])
						System.out.print(arrNum1[j] + " ");
				}
		} else if (arrNum1.length <= arrNum2.length) {
			for (int i = 0; i < arrNum1.length; i++)
				for (int j = 0; j < arrNum2.length; j++) {
					if (arrNum1[i] == arrNum2[j])
						System.out.print(arrNum2[j] + " ");
				}
		}
	}

	public static void putArray(int[] a, int number) {

		for (int i = 0; i < a.length; i++) {
			a[i] = number % 10;
			number /= 10;
		}
	}

	// Функция высчитывает размер массива
	public static int arrCount(int n) {
		int counter = 0;
		while (n != 0) {
			n /= 10;
			counter++;
		}
		return counter;
	}

}
