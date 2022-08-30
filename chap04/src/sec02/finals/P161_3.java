package sec02.finals;

public class P161_3 {

	public static void main(String[] args) {
		int eye1, eye2;
		do {
			eye1 = (int) (Math.random() * 6) + 1;
			eye2 = (int) (Math.random() * 6) + 1;
			System.out.println("("+eye1+","+eye2+")");
			} while(eye1 + eye2 != 5);
			
		}

	}

