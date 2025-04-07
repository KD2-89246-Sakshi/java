package com.sunbeam;

import java.util.stream.Stream;

public class Q1 {

	public static void main(String[] args) {
		int n =6;
		
		int factorial = Stream.iterate(1,i->i+1)
							  .limit(n)
							  .reduce(1,(a,b)->a*b);
		
		System.out.println("Factorial of Number is "+ factorial);
	}

}
