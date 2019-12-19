/*1) Create a class called Book that stores the information for each of the books in a library. 
The class should keep the title of the book, author, number of copies of the book and number of lend copies. 
The class will contain the following methods: Default constructor. Constructor with parameters. Setters / getters. 
Method Loan that increases the corresponding attribute each time a loan is made from the book. 
No books may be borrowed if no copies are available to lend. 
Returns true if the operation was successful and false otherwise. 
Returns method that decrements the corresponding attribute when a book is returned. 
No books can be returned that have not been lend. 
Returns true if the operation was successful and false otherwise. 
ToString method to display data from books. 
This method is inherited from Object and we must modify it (override) to adapt it to the Book class. 
Write a program to test the operation of the Book class.
*/

public class Book {

	private String title, author;
	private int numOfCopies, numOfLend;
	private Book[] bk;
	
	
	public Book () {

		this.setBk(new Book [100]);
		
	}
	
	public Book (String title, String author, int numOfCopies, int numOfLend) {

		this.title = title;
		this.author = author;
		this.numOfCopies = numOfCopies;
		this.numOfLend = numOfLend;
		
	}
	
	public Book (int maxCount) {
		
		this.setBk(new Book [maxCount]);
		
	}
	
	public void setTitle (String title) {
		
		this.title = title;
	}
	
	public String getTitle () {
		
		return this.title;
	}

	public void setAuthor (String author) {
		
		this.author = author;
	}
	
	public String getAuthor () {
		
		return this.author;
	}
	

	public void setNumOfCopies (int numOfCopies) {
		
		this.numOfCopies = numOfCopies;
	}
	
	public int getNumOfCopies () {
		
		return this.numOfCopies;
	}
	

	public void setNumOfLend (int numOfLend) {
		
		this.numOfLend = numOfLend;
	}
	
	public int getNumOfLend () {
		
		return this.numOfLend;
	}
	
	public Boolean loan () {
		Boolean isDone = false;
		
		if (this.numOfCopies > 0) {
			isDone = true;
			this.numOfCopies--;
			this.numOfLend++;
		}
		
		return isDone;
	}
		public Boolean returnBook () {
			Boolean isDone = false;
			
			if (this.numOfLend > 0) {
				isDone = true;
				this.numOfCopies++;
				this.numOfLend--;
			}
			
			return isDone;
			
	}
		
		public String toString(){ 
			  return this.author + "\t" + this.title + "\t" + this.numOfCopies + "\t" + this.numOfLend;  
			 }

		public Book[] getBk() {
			return bk;
		}

		public void setBk(Book[] bk) {
			this.bk = bk;
		}  
	
}
