import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Book
{
	String isbn;
	double price;
	String authorName;
	int quantity;
	
	public Book(String isbn, double price, String authorName, int quantity)
	{
		this.isbn= isbn;
		this.price = price;
		this.authorName=authorName;
		this.quantity=quantity;
	}
	
	public void display()
	{
		System.out.println("isbn: " + isbn +" | price :$" + price + " | Author: " +authorName+" | quantity: " + quantity);
	}
}
public class Library {

	public static void main(String[] args) { 
		ArrayList<Book> books = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Library menu:");
			System.out.println("1.Add New Book");
			System.out.println("2.Display all books(forward)");
			System.out.println("3.Display all books(Reverse");
			System.out.println("4.Delete book at given index");
			System.out.println("5.Exit");
			System.out.println("enter your choice");
			
			int choice= sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter isbn: ");
				String isbn = sc.nextLine();
				System.out.println("Enter price: ");
				double price = sc.nextDouble();
				sc.nextLine();
				System.out.println("enter author name");
				String authorName = sc.nextLine();
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();
				
				books.add(new Book(isbn, price, authorName, quantity));
				System.out.println("Book added succesfully");
				break;
				
			case 2: 	
				if (books.isEmpty())
				{
					System.out.println("No books available: ");
				}
				else
				{
					System.out.println("Book list : ");
					for(Book book : books )
					{
						book.display();
					}
					
				}
				break;
				
			case 3 :
				if(books.isEmpty())
				{
					System.out.println("No books avilable ");
				}
				else
				{
					System.out.println("Books list - reverse order");
					ArrayList<Book> reverseBooks = new ArrayList<>(books);
					Collections.reverse(reverseBooks);
					for(Book book : reverseBooks)
					{
						book.display();
					}
					
		
				}
				break;
			
			case 4:
				if(books.isEmpty())
				{
					System.out.println("No books avilable ");
				}else
				{
					System.out.println("Enter index to delete ");
					
					int index = sc.nextInt();
                    if (index >= 0 && index < books.size()) {
                        books.remove(index);
                        System.out.println(" Book deleted successfully.");
                    } else {
                        System.out.println(" Invalid index! Please try again.");

				}
						
			}
				break;
			case 5: 
				System.out.println("Exiting library syatem");
				sc.close();
				return ;
				
			default:
				System.out.println("Invalid choice");
			
		};

	}

}
}
