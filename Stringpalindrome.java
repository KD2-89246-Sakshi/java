package com.sunbeam;
import java.util.Scanner;

public class Stringpalindrome{

public static void main(String[] args) {
      String str = "madam";
      System.out.println(isPalindrome(str));
}
    static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;
   while (start < end) {
       if (str.charAt(start) != str.charAt(end)) {
       System.out.println("String is not palindrome");
}
     start++;
     end--;
}
      System.out.println("String is palindrome");
      return true;
}
}
