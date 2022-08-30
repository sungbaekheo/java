package sec02.finals;

import java.util.Scanner;

public class P161_7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택 > ");
			String choice = scan.nextLine();
			
			if(choice.equals("1")) {
				System.out.print("예금액 > ");
				balance += Integer.parseInt(scan.nextLine());
				System.out.println();
			}
			else if(choice.equals("2")) {
				System.out.print("출금액 > ");
				balance -= Integer.parseInt(scan.nextLine());
				System.out.println();
			}
			else if(choice.equals("3")) {
				System.out.println("잔고 > " + balance);
				System.out.println();
			}
			else if(choice.equals("4")) {
				System.out.println();
				break;
			}
			else {
				System.out.println("보기에 없는 선택입니다. 다시 선택해주세요.\n");
				continue;
			}
		}
		System.out.println("프로그램 종료");
	}

}
