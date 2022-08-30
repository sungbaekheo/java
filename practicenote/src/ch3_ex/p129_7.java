package ch3_ex;

public class p129_7 {

	public static void main(String[] args) {
		float var1 = 10f;
		//float var2 = var1 / 100; 를 아래로 수정
		double var2 = (double) var1 / 100;
		
		if(var2 == 0.1) {
			System.out.println("10%입니다.");
		}
		else {
			System.out.println("10%가 아닙니다.");
		}

	}

}
