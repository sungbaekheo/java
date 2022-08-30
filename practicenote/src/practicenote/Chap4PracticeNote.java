package practicenote;

import java.util.Arrays;

public class Chap4PracticeNote {

	public static void main(String[] args) {
		
		int sum = 0;
		int x = 0;
		//for(; x <= 20; x += 2) {
		for(x = 0; x <= 20; x+=2) {
			System.out.println("x = " + x);
		}
		//}
		
		String[] strAry1 = {"나무", "해", "달", "별", "바다"};
		String[] strAry2 = new String[strAry1.length];
		
		System.out.println(Arrays.toString(strAry1));
		System.out.println(Arrays.toString(strAry2));
		
		System.arraycopy(strAry1, 0, strAry2, 0, strAry1.length);
		
		System.out.println(Arrays.toString(strAry1));
		System.out.println(Arrays.toString(strAry2));
	}

}
