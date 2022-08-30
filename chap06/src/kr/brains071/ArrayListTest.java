package kr.brains071;

import java.util.Arrays;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayListExt<String> ale = new ArrayListExt<String>();
		
		
		Integer k = 100; // k는 Integer 클래스형 변수
		// implicit type conversion (묵시적 형변환) : 오토박싱
		// developer-talk.tistory.com/504
		int j = 50;
		int biK = Integer.parseInt(Integer.toBinaryString(k));
		System.out.println(biK);
		
		
		ale.add("고객");
		ale.add("경험");
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		ale.add("경험");
		ale.add("분석가");
		ale.add("과정");
		ale.printHello();
		ale.add(); // add(T) add() 중첩
		System.out.println(ale.lastIndexOf("데이터"));
		
		// for문: 반복 횟수가 정해진 경우 사용, 순차 접근 가능
		// 제어 변수에 따른 접근
		for(int i = 0; i < ale.size(); i+=2) {
			System.out.print(ale.get(i) + " ");
		}
		System.out.println();
		
		for(String i:ale) { // for each statement: collection 객체의 순차 접근
			System.out.print(i+" ");
		}
	
	}
	
}