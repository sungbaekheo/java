package chap0708practicenote;

public class Poem extends Literature {
	
	public Poem() {
		
	}
	
	public Poem(String name, String author, int pages) {
		super(name, author, pages);
		setSort("Poem");
	}

	@Override
	public void littering() {
		// TODO Auto-generated method stub
		System.out.printf(getAuthor()+" 작가의 "+getPages()+"쪽 짜리의 시 \""+ getName()+"\"를 버립니다.");
	}

	@Override
	public void donating() {
		// TODO Auto-generated method stub
		System.out.println(getAuthor()+" 작가의 "+getPages()+"쪽 짜리의 시 \""+ getName()+"\"를 기부합니다.");
	}

	@Override
	public void reading() {
		// TODO Auto-generated method stub
		System.out.println(getAuthor()+" 작가의 "+getPages()+"쪽 짜리의 시 \""+ getName()+"\"를 읽습니다.");
	}

}
