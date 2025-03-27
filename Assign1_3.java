import java.util.*;
public class Assign1_3 {

	public static void main(String[] args) {
		int choice;
		int total = 0;
		int quantity;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---menu---");
			System.out.println("1.Plain Dosa");
			System.out.println("2.Poha");
			System.out.println("3.Upma");
			System.out.println("4.idli sambhar");
			System.out.println("5.Vada pav");
			System.out.println("6.Samosa");
			System.out.println("7.Pani puri");
			System.out.println("8.Bhel");
			System.out.println("9.Paratha");
			System.out.println("10.Maggie");
			System.out.println("11.Total bill");
			System.out.println("12.Exit");
			System.out.println("Enter the choice");
			choice =  sc .nextInt();
			switch(choice)
			{
			case 1 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (30 * quantity);
				break;
				
			case 2 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (30 * quantity);
				break;
				
			case 3 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (30 * quantity);
				break;
				
			case 4 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (30 * quantity);
				break;
				
			case 5 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (20 * quantity);
				break;
				
			case 6 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (20 * quantity);
				break;
				
			case 7 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (30 * quantity);
				break;
				
			case 8 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (30 * quantity);
				break;
				
			case 9 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (50 * quantity);
				break;
				
			case 10 :
				System.out.println("Enter the quantity");
				quantity = sc.nextInt();
				total = (30 * quantity);
				break;
				
			case 11:
				System.out.println("Total bill :" +total);
				break;
				
			case 12:
				System.out.println("Thanks for visiting");
				return;
			}
		} while(choice !=0);

	}

}
