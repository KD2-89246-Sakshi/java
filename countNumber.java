//write a java program to count number of words in a String. Hint:
//You can use , trim() ,length() and split() methods

package com.sunbeam;

public class countNumber {

	public static void main(String[] args) {
		String str = "Sunbeam";
		System.out.println("Length : " + str.length());
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			System.out.println(ch);
		}

	}
	public static void main1(String[] args)
	{
		String str = "            Sakshi Dake            ";
		System.out.println("length : " + str.length());
		String s = str.trim();
		System.out.println("str : "+s);
		System.out.println("length : "+s.length());
	}

}
