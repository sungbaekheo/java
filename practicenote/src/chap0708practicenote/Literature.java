package chap0708practicenote;

public abstract class Literature {

	private String name;
	private String author;
	private int pages;
	private String sort;
	
	public Literature() {
		
	}
	
	public Literature(String name, String author, int pages) {
		this.name = name;
		this.author = author;
		this.pages = pages;
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	
	public abstract void littering();
	
	public abstract void donating();
	
	public abstract void reading();
	

}
