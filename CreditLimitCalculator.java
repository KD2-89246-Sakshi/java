import java.util.Scanner;
public class CreditLimitCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Customers:");
		int numCustomers = sc.nextInt();
		
		for(int i =1; i< numCustomers ; i++)
		{
			System.out.println("\nCustomer" + i+ "details:");
			
			System.out.println("Enter account number:");
			int accountNumber = sc.nextInt();
			
			System.out.println("Enter balance at the start of month:");
			int startBalance = sc.nextInt();
			
			System.out.println("Enter total of all items charged this month:");
			int totalCharges = sc.nextInt();
			
			System.out.println("Enter total of all credits applied this month:");
			int totalCredits = sc.nextInt();
			
			System.out.println("Enter allowed credit limit:");
			int creditLimit = sc .nextInt();
			
		  //calculate new balance 
			int newBalance = startBalance + totalCharges- totalCredits;
			
			//display results
			System.out.println("account number:" + accountNumber);
			System.out.println("New balance : "+newBalance);
			
			if(newBalance > creditLimit)
			{
				System.out.println("Credit limit exceeded.");
			}
			else {
				System.out.println("Credit limit not exceeded:");
			}
		
		}
		
	}

}
