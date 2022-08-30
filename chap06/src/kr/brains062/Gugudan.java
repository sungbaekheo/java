package kr.brains062;

public class Gugudan {
	private int col = 9;
	private int row = 9;
	int dan; // 인스턴스 변수: 구구단의 시작을 지정하는 수

	public Gugudan(int dan) {
		this.dan = dan;
	}
	// 지정한 단만 출력
	public static void printOne(int dan) { // dan: 지역 변수, 메소드 안에서만 유효
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}
	
	// 2 ~ 9 단을 출력
	public void printAll() {
		for(int i = 2; i <= row; i++) {
			System.out.println(i+"단");
			printOne(i);
			System.out.println();
			
		}
		
	}
	
	public void printFrom(int dan) {
		for(int i = dan; i <= row; i++) {
			System.out.println(i+"단");
			printOne(i);
			System.out.println();
		}
	}

}
