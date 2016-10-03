package book;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

public class ComparatorTest {
	ArrayList<Book> bookCollection = new ArrayList<Book>();
	NumberSortingTest<Book> titleSequence = new NumberSortingTest<Book>() {
		@Override
		public boolean sortingCheck(ArrayList<Book> list) {
			for(int i = 0; i < list.size()-1; i++) {
                if(list.get(i).getTitle().compareTo(list.get(i+1).getTitle()) > 0) {
                    return false;
                }
            }
			return true;
		}
	};
	
	@Before
	public void sortByIsbn() {
		bookCollection.add(new Book("Java", "Schildt", 5678, 12));
		bookCollection.add(new Book("Utopia", "Moor", 3245, 9));
		bookCollection.add(new Book("David Copperfield", "Dickens", 7654, 14));
		bookCollection.add(new Book("Pride and Prejudice", "Austen", 2425, 3));
		bookCollection.add(new Book("War and peace", "Tolstoy", 7564, 8));
		bookCollection.add(new Book("Adventures of Sherlock Holmes", "Doyle", 2455, 5));
		bookCollection.add(new Book("Adventures of Tom Saweyer", "Twain", 9654, 15));

		}
	
	@Test
	 public void comparableTest() {
        Collections.sort(bookCollection, BookComparators.getSortByTitle());
        assertTrue(titleSequence.sortingCheck(bookCollection));
    }

}
