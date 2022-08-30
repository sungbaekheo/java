package kr.brains064.same;

public class Same {
	private int privateField = 1;
	int defaultField = 2;
	protected int protectedField = 3;
	public int publicField = 4;
	
	void printPrivateField() {
		System.out.println(privateField);
	}
	boolean b = true;
	
	void setB(boolean bv) {
		b = bv;
	}
	
	boolean getB() {
		return b;
		
	}
}
