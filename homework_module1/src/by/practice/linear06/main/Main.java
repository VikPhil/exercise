/*
 * Для данной области составить линейную программу, которая печатает true,
 * если точка с координатами (х, у) принадлежит закрашенной области,
 * и false — в противном случае:
 * */
package by.practice.linear06.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x, y;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Введите координату 'x': ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Введите целое число (цифра): ");
			}
			
			x = sc.nextInt();
			System.out.print("Введите координату 'y': ");
			y = sc.nextInt();
		}
		
		System.out.print("Принадлежность точки закрашеной области равна: ");
		System.out.print(((y < 0 && y > -3) && (int)Math.abs(x) < 4) || 
						  (y > 0 && y < 4) && (int)Math.abs(x) < 2);


	}

}
