package book;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestBook {
	ArrayList<Book> bookCollection = new ArrayList<Book>();
	static NumberSortingTest<Book> nst = null; 
	
	@BeforeClass
	public static void init() {
		nst = new NumberSortingTest<Book>() {
			@Override
			public boolean sortingCheck(ArrayList<Book> list) {
				for (int i = 0; i < list.size()-1; i++) {
					if(list.get(i).getIsbn() > list.get(i+1).getIsbn()) {
						return false;
					}	
				}
				return true;
			}
		};
	}

	@Test
	public void tstCompareTo() {
		Collections.sort(bookCollection);
		assertTrue(nst.sortingCheck(bookCollection));
	}
}
	

