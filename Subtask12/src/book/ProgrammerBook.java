package book;

public class ProgrammerBook extends Book{
	private String language;
	private int level;
	
	public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
		super(title, author, price, isbn);
		this.language = language;
		this.level = level;	
	}

	public String getLanduage() {
		return language;
	}

	public int getLevel() {
		return level;
	}

	public String toString() {
		return "title " + super.getTitle() + ", author " + super.getAuthor() + ", price " + super.getPrice() 
				+ ", language " + language + ", level " + level;
	}

	public boolean equals(ProgrammerBook pb) {
		if (pb == null)
			return false;
		return (((this.language).equals(pb.language)) && ((this.level == pb.level)));
	}

	public int hashCode() {
		return 88 * this.language.hashCode() + 88 * this.level;
	}
	
	
}
