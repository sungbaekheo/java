package kr.brains072;

public class Trapezoid extends Polygon {
	
	private int uWidth;
	
	public Trapezoid(int height, int width, int uWidth) {
		super(height, width);
		this.uWidth = uWidth;
		setName("Trapezoid");
	}
	
	@Override // annotation
	public int evaluate() { // 재정의
		return (uWidth * getHeight() + (getWidth() * getHeight() / 2));
	}

}
