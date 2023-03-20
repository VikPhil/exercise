/*
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения):
		b + √b^2 + 4ac
	-------------------- − a^3 c + b^−2
			2a
 * */

package by.practice.linear02.main;

public class Main {

	public static void main(String[] args) {
		double a, b, c, result;

		a = 5.0;
		b = 2.0;
		c = 3.0;

		result = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)
				/ 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.print(result);

	}

}
