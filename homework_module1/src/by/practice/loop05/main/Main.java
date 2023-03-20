/*
 * Вывести на экран соответствий между символами и их численными обозначениями
 * в памяти компьютера.
 * */
package by.practice.loop05.main;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i < Character.MAX_VALUE; i++) {
			System.out.print(i + ":[" + (char) i + "] ");
			if (i % 10 == 0)
				System.out.println();
		}

	}

}
