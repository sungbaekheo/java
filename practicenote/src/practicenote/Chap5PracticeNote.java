package practicenote;

public class Chap5PracticeNote {
	public static void main(String[] args) {
		/*
		int[] scores = { 83, 90, 87, 100, 78 };
		
		int sum = 0;
		
		for(int i : scores) {
			sum += i;
		}
		double avg = (double) sum / scores.length;
		
		System.out.println("다섯 점수의 총합: " + sum);
		System.out.println("다섯 명의 평균 점수: " + avg);
		*/
		
		int[][] javaScores = { {88, 95, 80}, {92, 96, 80} };
		
		for(int i = 0; i < javaScores.length; i++) {
			int sum = 0;
			for(int j = 0; j < javaScores[i].length; j++) {
				System.out.println("javaScores["+i+"]["+j+"] = " + javaScores[i][j]);
				sum += javaScores[i][j];
			}
			System.out.println("javaScore["+i+"]의 점수 총합 = " + sum +"\n");
		}
	}

}