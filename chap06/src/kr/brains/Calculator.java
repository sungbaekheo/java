package kr.brains;

public class Calculator {
	
	// Access modifier: 접근 수정자, 접근 식별자
	//public(누구나 사용)
	//protected(같은 패키지에 있지 않아도 상속 관계에 있으면 사용)
	//기본(아무것도 쓰지 않음, 같은 패키지에 있는 Class들만 사용하게 해줄래)
	//private(나 혼자 사용할래)
	int operand1;
	int operand2;
	String operator;
	// constructor: 객체 초기화
	// this: 
	public Calculator() { // 기본 (default) 생성자
		this(10, "+", 20);
	}
	
	public Calculator(int o1, String op, int o2) {
		this.operand1 = o1;
		this.operator = op;
		this.operand2 = o2;
	}
	
	public int calc() {
		int result = 0;
		if(operator.equals("+")) {
			result = operand1 + operand2;
		}
		return result;
	}
	// custom method
	public int add(int operand1, int operand2) {
		return operand1 + operand2;
	}
	public int sub(int operand1, int operand2) {
		return operand1 - operand2;
	}
	public int multi(int operand1, int operand2) {
		return operand1 * operand2;
	}
	public double div(double operand1, double operand2) {
		return operand1 / operand2;
	}
	
		

}