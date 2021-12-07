package sum_of_two_numbers;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the first number");
    int a = scanner.nextInt();
    System.out.println("Please enter the second number");
    int b = scanner.nextInt();

    int c = a + b;
    System.out.println("The sum is: " + c);
  }

  /*
  The issue in the Buggy class is that the two numbers are "added" in the print line which just concatenates them to the string.
   */
}
