package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		for(int i = 0; i < 3; i++) {
			sum += scores[i];
			System.out.println(scores[i]);
		}
		double avg = (double) sum / scores.length;
		
		System.out.println(avg);
		
		for(int i : scores) {
			System.out.println(i);
		}
	}

}
