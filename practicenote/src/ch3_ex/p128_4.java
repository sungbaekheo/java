package ch3_ex;

public class p128_4 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 1명이 가지는 연필 개수
		int pencilsPerStudent = (pencils / students);
		System.out.println(pencilsPerStudent);
		
		// 남은 연필 개수
		int pencilLeft = (pencils % students);
		System.out.println(pencilLeft);

	}

}
