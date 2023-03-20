/*
 * Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения):
	sin x + cos y
∗ 	-------------	* tg xy
	cos x − sin y
 * */
package by.practice.linear03.main;

public class Main {

	public static void main(String[] args) {
		double x, y, result;

		x = 1.0;
		y = 0.8;
		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);

		System.out.print(result);

	}

}
