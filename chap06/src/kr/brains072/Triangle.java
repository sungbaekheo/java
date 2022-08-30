package kr.brains072;

public class Triangle extends Polygon {
	
	public Triangle(int height, int width) {
		super(height, width);
		setName("Triangle");
	}

	@Override
	public int evaluate() {
		return (getHeight()*getWidth() / 2);
	}

	

}
