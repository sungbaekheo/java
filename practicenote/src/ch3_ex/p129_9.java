package ch3_ex;

import java.util.Scanner;

public class p129_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		double num1 = scan.nextDouble();
		System.out.print("두번재 수: ");
		double num2 = scan.nextDouble();
		
		if(num2 == 0 | num2 == 0.0) {
			System.out.println("결과: 무한대");
		}
		else {
			System.out.println("결과: " + num1 / num2);
		}

	}

}
