package chap0708practicenote;

public class ClassHierarchyExample {
	
	public static void main(String[] args) {
		
		Literature nv = new Novel("노인과 바다", "헤밍웨이", 372);
		
		nv.littering();
		nv.donating();
		nv.reading();
		
		DoubleHierarchy neo = new DoubleHierarchy("신곡", "단테", 1203);
		
		neo.donating();
		System.out.println(neo.getSort());
	}

}
