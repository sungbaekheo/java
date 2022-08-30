package kr.brains072;

public class Square extends Polygon {
	
	private int length;
	// 생성자: 객체 초기화
	// sub 클래스로부터 객체를 생성할 때,
	// super 클래스의 객체(필드, 메소드)도 준비되어야 함
	public Square(int length) {
		this.length = length;
		setName("Square");
	}

	@Override // annotation
	public int evaluate() { // 재정의
		return (length*length);
	}

}
