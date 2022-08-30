package kr.brains071;

// 같은 패키지에 존재하는 클래스나 java.lang 패키지에 포함된 클래스는 import 없이 사용 가능
import java.util.ArrayList;

//JCF: Java collection Framework
// 이해: 상속, 인터페이스, 추상클래스, 제너릭(Generics)
public class ArrayListExt<T> extends ArrayList<T> {

	public void printHello() {
		System.out.println("클래스, 객체, 상속 어렵다.");
	}
	
	public boolean add() {
		// 중첩: 이름 같고 매개변수 갯수, 타입 다름 (기존 메소드 사용 가능)
		super.add((T)"허성백");
		System.out.println("자바프로그래밍");
		return true;
	}
	
	public int lastIndexOf(Object o) { //재정의
		// 재정의: 이름, 갯수, 타입 같음 (기존 메소드 사용 불가)
		return 100;
	}
}