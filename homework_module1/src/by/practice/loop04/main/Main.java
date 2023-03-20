/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 * */
package by.practice.loop04.main;

public class Main {

	public static void main(String[] args) {
		double sqMul = 1.0;

		for (int i = 1; i <= 200; i++)
			sqMul *= (i * i);

		System.out.print("Произведение квадратов равно: " + sqMul);

	}

}
