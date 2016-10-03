package book;

import java.util.ArrayList;
import java.util.Comparator;

public class Book implements Comparable<Book>, Comparator<Book>{
	private String title;
	private String author;
	private int price;
	private static int edition;
	private int isbn;
	
	public Book() {
		
	}
	public Book(String title, String author, int price, int isbn) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}

	public String toString() {
		return "title " + title + ", author " + author + ", price " + price;
	}

	public boolean equals(Book b) {
		if (b == null)
			return false;
		return (((this.title).equals(b.title)) && ((this.author).equals(b.author)) 
				&& ((this.price) == (b.price)));
				//&& ((this.edition) == (b.edition)));
	}

	public int hashCode() {
		return 88 * this.title.hashCode() + 88 * this.author.hashCode() + 88 * this.price;
	}

	protected Object clone() throws CloneNotSupportedException {
		return new Book(this.title, this.author, this.price, this.isbn);
	}
	
	@Override
	public int compareTo(Book b) {
		if (this.isbn == b.isbn) {
			return 0;
		}
		else if (this.isbn < b.isbn) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	
}
