/*
 * Найти сумму квадратов первых ста чисел.
 * */
package by.practice.loop03.main;

public class Main {

	public static void main(String[] args) {
		double sqSum = 0.0;

		for (int i = 1; i <= 100; i++)
			sqSum += i * i;

		System.out.print("Сумма квадратов певых ста чисел равна: " + sqSum);
	}

}
