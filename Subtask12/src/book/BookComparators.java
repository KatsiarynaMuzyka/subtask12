package book;

import java.util.Comparator;

public class BookComparators {
	private static final Comparator<Book> sortByTitle = new Comparator<Book>() {
	      @Override
	      public int compare(Book b1, Book b2) {
	         return b1.getTitle().compareTo(b2.getTitle());
	      }
	   };

	   public static final Comparator<Book > sortByTitleAndAuthor = new Comparator<Book>() {
	      @Override
	      public int compare(Book b1, Book b2) {
	        int result =  b1.getTitle().compareTo(b2.getTitle());
	         if (result != 0) {
	        	 return result;
	         }
	         result = b1.getAuthor().compareTo(b2.getAuthor());
	         if (result != 0) {
	        	 return result;
	         }
	         else {
	        	 return 0;
	         }
	         //return result != 0 ? result : 0;
	      }
	   };

	   private static final Comparator<Book> sortByAuthorAndTitle = new Comparator<Book>() {
	      @Override
	      public int compare(Book b1, Book b2) {
	         int result = b1.getAuthor().compareTo(b2.getAuthor());
	         if(result != 0) {
	        	 return result;
	         }
	         result = b1.getTitle().compareTo(b2.getTitle());
	         if (result != 0) {
	        	 return result;
	         }
	         else {
	        	 return 0;
	         }
	         //return result != 0 ? result : 0;
	      }
	   };

	   private static final Comparator<Book> sortByAuthorAndTitleAndPrice = new Comparator<Book>() {
	      @Override
	      public int compare(Book b1, Book b2) {
	         int result = b1.getAuthor().compareTo(b2.getAuthor());
	         if(result != 0) {
	        	 return result;
	         }
	         result = b1.getTitle().compareTo(b2.getTitle());
	         if(result != 0) {
	        	 return result;
	         }
	         result = b1.getPrice() - b2.getPrice();
	         if (result != 0) {
	        	 return result;
	         }
	         else {
	        	 return 0;
	         }
	         //return result != 0 ? result : 0;
	      }
	   };

	   public static Comparator<Book> getSortByTitle() {
	      return sortByTitle;
	   }

	   public static Comparator<Book> getSortByTitleAndAuthor() {
	      return sortByTitleAndAuthor;
	   }

	   public static Comparator<Book> getSortByAuthorAndTitle() {
	      return sortByAuthorAndTitle;
	   }

	   public static Comparator<Book> getSortByAuthorAndTitleAndPrice() {
	      return sortByAuthorAndTitleAndPrice;
	   }
}
