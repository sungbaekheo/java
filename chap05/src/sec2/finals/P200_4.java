package sec2.finals;

public class P200_4 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 9, 5, 3, 8, 2 };
		int min = array[0];
		
		for(int i : array) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);

	}

}
