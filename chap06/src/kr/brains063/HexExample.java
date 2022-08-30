package kr.brains063;

import java.util.Scanner;

public class HexExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MakeHex mh = new MakeHex();
		
		System.out.print("16진수로 변환하고자 하는 수를 입력하세요. > ");
		int num = Integer.parseInt(scan.nextLine());
		
		String hexNum = mh.makeHexNum(num);
		System.out.println("입력한 "+num+"의 16진수는 " +hexNum + "입니다.");
		
		System.out.println(Integer.toHexString(101034235));
	}

}
