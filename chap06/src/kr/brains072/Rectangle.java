package kr.brains072;

public class Rectangle extends Polygon {
	
	public Rectangle(int height, int width) {
		super(height, width); // 수퍼클래스의 생성자 호출
		// 컴파일러가 묵시적으로 super 클래스의 해당 생성자를 호출
		setName("Rectangle");
	}
	
	@Override // annotation
	public int evaluate() { // 재정의
		return (getWidth() * getHeight());
	}
	
	

}
