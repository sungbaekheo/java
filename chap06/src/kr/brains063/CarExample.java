package kr.brains063;

import java.util.ArrayList;

public class CarExample {
	
	public static void main(String[] args) {
		
		// setGas() 정적 메소드가 아니므로 객체 생성후 접근 가능
		//System.out.println("현재모델: " + Car.setGas("80L"));
		System.out.println("현재 모델: " + Car.MODEL);
		System.out.println("가장 큰 int 값: " + Integer.MAX_VALUE);
		Car car = new Car();
		// car.MODEL = "가스차";
		car.setGas("70L"); // setter를 이용한 값 배정
		// 검증된 값을 배정
		System.out.println("현재 gas: " + car.getGas());
		car.run();
		/*
		String str = "현대자동차";
		System.out.println(str.charAt(3));
		int i = 66;
		// Integer: int 기본형을 효과적으로 조작하기 위해 정의한 클래스
		// Wrapper Class: 기본자료형을 효과적으로 조작하기 위해 정의한 클래스
		System.out.println(Integer.toHexString(i));
		*/
	}

}
