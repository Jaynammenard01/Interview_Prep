package sum_of_threes_and_fives;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = scanner.nextInt();
    int sum = find_sum(number, 3) + find_sum(number, 5);

    System.out.println("The sum of all the multiples of 3 and 5 is : " + sum);
  }

  static int find_sum(int number, int multiple) {
    int howManyMultiples = (number - number % multiple) / multiple;// need to know how many times 3 or 5 goes into to number with no remainder
    return multiple * (howManyMultiples * (howManyMultiples - 1) / 2 + howManyMultiples); // sum of n integers equals {(n * (n - 1)) / 2} + n
      /* Sum of first 5 multiples of 3=
        = 3 + 6 + 9 + 12 + 15
        = 3 * (1 + 2 + 3 + 4 + 5)
        = 3 * (sum of first 5 integers)
        sum of n integers equals {(n * (n - 1)) / 2} + n
        3 * {5 * 4 / 2 + 5} = 45
     */
  }

  /*
  The issue in the buggy class is all the parentheses in the return statement have been removed so the order of opperations is all messed up
  Also the final add of howManyMultiples was removed
   */

}
