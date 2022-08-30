package kr.brains.api;

public class Car {
	private double speed = 20;
	public void speedUP() {
		speed = speed * (1 + Math.random());
		System.out.println("속도 증가" + speed);
	}

}
