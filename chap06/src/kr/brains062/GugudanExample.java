package kr.brains062;

import kr.brains.ModCalculator;

public class GugudanExample {

	public static void main(String[] args) {
		// 클래스의 생성자를 호출하여 객체를 생성하고, gugudan 참조변수에 할당
		// 참조 변수도 참조하는 클래스와 같은(또는 상위클래스 형)
		Gugudan.printOne(3);
		
		
		SubGugudan subGu = new SubGugudan(3);
		Gugudan gugu = new Gugudan(3);
		
		ModCalculator cal = new ModCalculator(10, "*", 20);
		
		
		/* gugu.printOne(3);
		
		System.out.println("\n---------------------\n");
		
		gugu.printAll();
		
		System.out.println("\n---------------------\n");
		
		gugu.printFrom(5);
		
		System.out.println("\n---------------------\n");
		
		subGu.printFrom(5, "down");
		subGu.printFrom(5);
		subGu.printOne(3); */
		
		

	}

}