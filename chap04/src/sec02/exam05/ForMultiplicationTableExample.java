package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d단\n", i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%1$d x %2$d = %3$d\n", i, j, (i*j));
			}
			System.out.println();
		}

	}

}
