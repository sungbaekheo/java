package kr.brains.api;

public class APIExample {
	
	public static void main(String[] args) {
		
		Overriding over = new Overriding();
		Class c1 = null;
		try {
			Class cl = Class.forName("kr.brains.api.Overriding");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		if(i1 == i2)
			System.out.println("true");
		else
			System.out.println("false");
		over.testEquals(i1, i2);
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		over.testEquals(o1,o2);
		
		//shift 연산은 비트단위 연산
		// 1번 오른쪽으로 밀 때마다 2로 나누는 효과
		System.out.println(128 >> 3);
		System.out.println(128 << 3);
		
		System.out.println(Integer.toBinaryString(128));
		System.out.println(Integer.toBinaryString(16));
		System.out.println(Integer.toBinaryString(1024));
		
		Integer intRef = new Integer(100);
		try {
			Integer intRef2 = Integer.valueOf("100L");
			System.out.println("예외발생 시 실행 안 됨");
		} catch(NumberFormatException nfe) {
			System.out.println("예외발생 처리: " + nfe.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 처리: " + e.getMessage());
		} finally {
			System.out.println("예외 발생 여부와 관계없이 실행되어야 하는 문장들");
		}
		int intRef3 = 100; // autoboxing
	}

}
