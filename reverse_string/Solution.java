package reverse_string;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please type a string to be reversed");
    String str = scanner.nextLine();
    char ch;
    String nstr = "";
    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i); //extracts each character
      nstr = ch + nstr; //adds each character in front of the existing string
    }
    System.out.println("The string reversed is: " + nstr);
  }

  /*
  The issue in the Buggy class is the += doesn't reorder the chars.
  It needs to be =+ but that doesn't work with strings, so either ch + nstr or use a string builder.
   */
}
