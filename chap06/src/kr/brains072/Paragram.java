package kr.brains072;

public class Paragram extends Polygon {
	
	public Paragram(int height, int width) {
		super(height, width);
		setName("Paragram");
	}
	
	@Override // annotation
	public int evaluate() { // 재정의
		return (getWidth() * getHeight());
	}

}
