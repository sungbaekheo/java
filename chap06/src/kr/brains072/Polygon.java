package kr.brains072;

// 다각형의 넓이를 구하기 위한 클래스를 정의
public abstract class Polygon {
	
	// 삼각형, 직사각형, 정사각형, 평행사변형, 사다리꼴
	private int height; //세로
	private int width; //가로
	private int area; // 넓이
	private int length;
	private String name;
	
	public Polygon() {
		
	}
	
	public Polygon(int height, int width) {
		this.height = height;
		this.width = width;
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setElement(int height, int width) {
		if(height <= 0 || width <= 0) {
			System.out.println("0보다 작은 값, 모두 1로 초기화합니다.");
			this.height = 1;
			this.width = 1;
		}
		else {
			this.height = height;
			this.width = width;
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public abstract int evaluate(); // 추상 메소드: 상속받는 쪽에서 구현
}
