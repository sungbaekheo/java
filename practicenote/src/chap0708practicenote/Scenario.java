package chap0708practicenote;

public class Scenario extends Literature {
	
	public Scenario() {
		
	}
	
	public Scenario(String name, String author, int pages) {
		super(name, author, pages);
		setSort("Scenario");
	}

	@Override
	public void littering() {
		// TODO Auto-generated method stub
		System.out.println(getAuthor()+" 작가의 "+getPages()+"쪽 짜리의 시나리오 \""+ getName()+"\"를 버립니다.");
	}

	@Override
	public void donating() {
		// TODO Auto-generated method stub
		System.out.println(getAuthor()+" 작가의 "+getPages()+"쪽 짜리의 시나리오 \""+ getName()+"\"를 기부합니다.");
	}

	@Override
	public void reading() {
		// TODO Auto-generated method stub
		System.out.println(getAuthor()+" 작가의 "+getPages()+"쪽 짜리의 시나리오 \""+ getName()+"\"를 읽습니다.");
	}

}
