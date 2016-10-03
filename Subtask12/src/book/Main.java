package book;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Book book1 = new Book("Java", "Schildt", 643654, 7);
        Book book2 = (Book) book1.clone();
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book2));
        System.out.println(book1 == book2);
        System.out.println(book1.toString());
        
        ProgrammerBook progBook1 = new ProgrammerBook("Script", "Author", 776789, 3, "english", 5);
        System.out.println(progBook1.hashCode());
        System.out.println(book1.equals(progBook1));
        System.out.println(progBook1.toString());
        System.out.println(book1.compareTo(progBook1));
        System.out.println(book1.compare(book2, progBook1));
	}

}
