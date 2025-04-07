package com.sunbeam;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int res = Arrays.stream(arr)
		.reduce(0,(a,i)->a+i);
		
		
		System.out.println("Result : "+ res);
		
	}

}

