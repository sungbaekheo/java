package kr.brains062;

// Gugudan 클래스가 같은 패키지에 있는 경우 (향후 import 되었거나)
public class SubGugudan extends Gugudan {
	
	public SubGugudan(int dan) {
		super(dan); // this([매개변수목로]) : 현재 클래스의 생성자를 호출
		// vs. super([매개변수목로]) : 부모클래스(수퍼클래스)의 생성자를 호출 
	}
	
	
	
	// direction: up, down - up dan -> 9단, down 2단 -> dan
	public void printFrom(int dan, String direction) {
		switch(direction) {
		case "down" : 
			for(int i = 2; i <= dan; i++) {
				System.out.println(i+"단");
				printOne(i);
				System.out.println();
			}
			break;
		case "up" : printFrom(dan);
		}
		
	}

}
