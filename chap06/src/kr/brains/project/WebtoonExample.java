package kr.brains.project;

import java.util.ArrayList;

public class WebtoonExample {
	
	public static ArrayList<Book> alBook = new ArrayList<>();
	
	public static void main(String[] args) {
		// 등록
		Book w1 = new Webtoon("i-1234", "나혼자 레벨업", "판타지", "추공");
		Book w2 = new Webtoon("i-1235", "미생2", "드라마", "윤태호");
		Book w3 = new Webtoon("i-1236", "기생수", "스릴러", "몰라");	
		
		alBook.add(w1);
		alBook.add(w2);
		alBook.add(w3);
		alBook.add(new Webtoon("i-1237", "장풍전", "코믹", "신영우"));
		
		// 출력
		for(Book b : alBook) {
			System.out.println(b.toString());
		}
		
		//예외처리 꼭 해달라고 하기
	}

}
