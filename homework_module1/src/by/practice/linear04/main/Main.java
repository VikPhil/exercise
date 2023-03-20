/*
 * Дано действительное число R вида nnn.ddd
 * (три цифровых разряда в дробной и целой частях). Поменять местами
	дробную и целую части числа и вывести полученное значение числа.
 * */

package by.practice.linear04.main;

public class Main {

	public static void main(String[] args) {
		double number = 332.278;
		double t;

		System.out.println(number);
		
		t = number * 1000 % 1000;
		number = (int)number / 1000.0 + t;

		System.out.println(number);
	}

}
