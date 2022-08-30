package kr.brains063;

public class Car {
	//2개의 인스턴스 멤버 변수, 4개의 인스턴스 메소드
	// public static final: 상수 변수 정의, 전체 대문자로 
	public static final String MODEL = "전기차";
	private int gas;
	
	//Setter/Getter Method;
	void setGas(String gas) { // 가스를 주입한 결과
		;
		int fuel = Integer.parseInt(gas.substring(0, gas.length() -1));
		
		if(fuel > 60) {
			System.out.println((fuel - 60) + "L 초과, 60L만 주입합니다.");
			fuel = 60;
		}
		this.gas = fuel;
	}
	int getGas() {
		return gas;
	}
	
	boolean isLeftGas() {
		boolean isLeft = true;
		if(gas == 0) {
			System.out.print("gas가 없습니다.\n");
			isLeft = false;
		}
		else {
			System.out.print("gas가 있습니다.\n");
		}
		return isLeft;
	}
	
	void run() {
		while(isLeftGas()) { // while문 조건식에 클래스 호출 가능!!!
			if(gas >= 1) {
				System.out.println("달립니다. gas 잔량 ("+ gas + ")");
				gas -= 1;
			}
			else {
				System.out.println("멈춥니다. gas 잔량 ("+ gas + ")");
				break;
			}
		}
	}

}
