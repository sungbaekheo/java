package kr.brains.project;

import java.time.LocalDateTime;
import java.util.Objects;

// 웹툰을 등록, 조회
// 웹툰은 Book 종류이다.
// 웹툰의 주요 속성은? 제목, 장르, 저자, 판매량

public class Webtoon implements Book {
	
	private String isbn; // 유일한 식별자
	private String title;
	private String genre;
	private String author;
	private LocalDateTime date;
	private int count;

	public Webtoon() {
		
	}
	
	public Webtoon(String isbn, String title, String genre, String author) {
		this.isbn = isbn;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.date = LocalDateTime.now(); // 등록일자, 출판일자?
		
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}

	@Override
	public void setGenre(String genre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		// 패키지 + 클래스명@hexa해쉬코드
		return "Webtoon [title=" + title + ", genre=" + genre + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, date, genre, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 참조하는 객체가 같으면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Webtoon other = (Webtoon) obj;
		return Objects.equals(author, other.author) && Objects.equals(date, other.date)
				&& Objects.equals(genre, other.genre) && Objects.equals(title, other.title);
	}

}