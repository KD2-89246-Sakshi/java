package com.sunbeam.myexception.NegativeDiameterException;

public class Program {

	public static void main(String[] args) {
		Circlenew c1 = new Circlenew();
		c1.displayData();
		try
		{
			Circlenew c2 = new Circlenew(153, 213, 255);
			c2.displayData();
			Circlenew c3 = new Circlenew(153, 213, -255);
			c3.displayData();
		} catch (NegativeDiameterException e)
		{
			System.out.println("Error meggase : " + e.getMessage( ));
		}

	}

}
