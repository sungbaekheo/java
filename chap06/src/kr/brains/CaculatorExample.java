package kr.brains;

import java.util.Scanner;

// 하나의 파일에는 public class가 하나만 존재함
// 파일 이름은 public class가 있는 경우 public class 이름임
// public class가 없는 경우 이름은 선택 가능함
// Class의 이름은 대문자로 시작한다.
// 생성자는 class 이름과 같고, 반환 유형이 없다.

public class CaculatorExample {
	
	public static void main(String[] args) {
		// 기본 생성자 (매개 변수가 없는) 를 호출하여 객체를 생성
		// 클래스                     // 생성자
		// calculator: 객체 참조 변수
		
		Scanner scan = new Scanner(System.in);
		
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		Calculator cal = new Calculator();
		System.out.println(cal.calc());
		// GC (Garbage Collection) 동작으로 메모리에서 향후 제거
		cal = new Calculator(23, "*", 40);
		System.out.println(cal.add(a, b));
		System.out.println(cal.sub(a, b));
		System.out.println(cal.multi(a, b));
		System.out.println(cal.div(a, b));
		
		ModCalculator modRef = new ModCalculator(1, "+", 2);
		System.out.println(modRef.add(a, b));
	}

}