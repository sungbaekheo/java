package kr.brains072;

import java.util.ArrayList;
import java.util.Arrays;

public class PolygonExample {
	public static void main(String[] args) {
		
		ArrayList<Polygon> arrPoly = new ArrayList<>();
		
		//Triangle tri = new Triangle(50, 80);
		Polygon poly = new Triangle(50, 80);
		//System.out.println(poly.evaluate());
		arrPoly.add(poly);
		//Square sqr = new Square(80);
		poly = new Square(80);
		//System.out.println(poly.evaluate());
		arrPoly.add(poly);
		//Rectangle rtg = new Rectangle(50, 80);
		poly = new Rectangle(50, 80);
		//System.out.println(poly.evaluate());
		arrPoly.add(poly);
		//Paragram prg = new Paragram(50, 80);
		poly = new Paragram(50, 80);
		//System.out.println(poly.evaluate());
		arrPoly.add(poly);
		//Trapezoid trp = new Trapezoid(50,80,30);
		poly = new Trapezoid(50, 80, 30);
		//System.out.println(poly.evaluate());
		arrPoly.add(poly);
		
		
		for(int i = 0; i < arrPoly.size(); i++) {
			System.out.println(arrPoly.get(i));
		}
		
		for(Polygon p : arrPoly) {
			whoIs(p); // 매개변수의 유형에 따라 다르게 동작: 매개변수 다형성
		}
		
		
		for(Polygon p : arrPoly) {
			if(p instanceof Triangle)
				System.out.println("삼각형의 넓이는: " + p.evaluate());
			else if(p instanceof Square)
				System.out.println("정사각형의 넓이는: " + p.evaluate());
			else if(p instanceof Rectangle)
				System.out.println("직사각형의 넓이는: " + p.evaluate());
			else if(p instanceof Trapezoid)
				System.out.println("사다리꼴의 넓이는: " + p.evaluate());
			else if(p instanceof Paragram)
				System.out.println("평행사변형의 넓이는: " + p.evaluate());
			
		}	
			
		//System.out.println(tri.evaluate());
		//System.out.println(sqr.evaluate());
		//System.out.println(rtg.evaluate());
		//System.out.println(prg.evaluate());
		//System.out.println(trp.evaluate());
		
		Object str = new String("HELLO");
		System.out.println(str);
		
		String sRef = "Hello";
		Integer iRef = Integer.valueOf(100);
		Integer iRef2 = 30; // AutoBoxiing
		iRef = iRef2;
		Object o = (Object) iRef;
		if(o instanceof String) { // where are you from? (class)
			sRef = (String) o;
			sRef.substring(3);
		}
		
	}

	
	public static void whoIs(Polygon p) {
		if(p instanceof Triangle)
			System.out.println("삼각형의 넓이는: " + p.evaluate());
		else if(p instanceof Square)
			System.out.println("정사각형의 넓이는: " + p.evaluate());
		else if(p instanceof Rectangle)
			System.out.println("직사각형의 넓이는: " + p.evaluate());
		else if(p instanceof Trapezoid)
			System.out.println("사다리꼴의 넓이는: " + p.evaluate());
		else if(p instanceof Paragram)
			System.out.println("평행사변형의 넓이는: " + p.evaluate());
			
		}

}