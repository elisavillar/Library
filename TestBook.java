import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner (System.in);
		String title, author;
		int numOfCopies, numOfLend, pos, auxPos = 0;
		
		
		System.out.println("Enter the amount of books that you are going to enter:");
		int quantity = myObj.nextInt();
		
		Book[] bk = new Book [quantity];
		
		
		for (pos = 0; pos < bk.length ; pos++) 
		{
			System.out.println("Enter the title:");
			title = myObj.next();
			
			System.out.println("Enter the author:");
			author = myObj.next();
			
			System.out.println("Enter the number of copies available:");
			numOfCopies = myObj.nextInt();
			
			System.out.println("Enter the number of copies that had been lent:");
			numOfLend = myObj.nextInt();
			
			bk[pos] = new Book (title, author, numOfCopies, numOfLend);
		}
		
		System.out.println("Enter the title of the book you want:");
		title = myObj.next();
		
		for (pos = 0; pos < bk.length ; pos++) {
			if (title == bk[pos].getTitle()) {
				auxPos = pos;
			}
		}
		
		String message = (bk[auxPos].loan()) ? "The book can be lend" : "There is no more copies available of that book";
		
		System.out.println(message);
		
		System.out.println("Enter the title of the book you want to return:");
		title = myObj.next();
		
		for (pos = 0; pos < bk.length ; pos++) {
			if (title == bk[pos].getTitle()) {
				auxPos = pos;
			}
		}
		
		message = (bk[auxPos].returnBook()) ? "Thank you!" : "There is no copies to be return for that book";
		
		System.out.println(message);
		
		
		myObj.close();

	}

}
