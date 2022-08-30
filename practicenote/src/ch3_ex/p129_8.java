package ch3_ex;

public class p129_8 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop*height + (double) (lengthBottom-lengthTop)*height / 2);
		System.out.println(area);

	}

}
