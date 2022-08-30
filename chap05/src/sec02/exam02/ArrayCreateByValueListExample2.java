package sec02.exam02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCreateByValueListExample2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		
		int sum1 = 0;
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합: " + sum1);
		
		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합: " + sum2);
		System.out.println();
		
		int[] nm = new int[5];
		for(int i = 0; nm.length > i; i++) {
			System.out.print("정수를 입력해주세요.: ");
			nm[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(nm));
		int sum3 = add(nm);
		System.out.println("총합: " + sum3);
	}

	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
