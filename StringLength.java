//Define a new exception, called ExceptionLineTooLong, that prints out the error message "The
//strings is too long". Write a program that reads a String from user and calculates its length. and throws
//an exception of type ExceptionLineTooLong in the case where a string of length is more than 80
//characters.


import java.util.Scanner;

class ExceptionLineTooLong extends Exception
{
	public ExceptionLineTooLong()
	{
		super("The string is too long");
	}
}
public class StringLength {
	public static void checkStringLength(String Input) throws ExceptionLineTooLong
	{
		if(Input.length()> 80)
		{
			throw new ExceptionLineTooLong();
		}
		else
		{
			System.out.println("String length is " + Input.length() + ", within limit");
		}
	}
	
	
     //main function 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String Input = sc.nextLine();
		
		//try catch block 
		try
		{
			checkStringLength(Input);
		}
				catch(ExceptionLineTooLong e)
				{
					System.out.println("Error : " + e.getMessage());
				}
			}
		}

	


