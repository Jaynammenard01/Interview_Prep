package sum_of_threes_and_fives;

import java.util.Scanner;

public class Buggy {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number");
    int number = scanner.nextInt();
    int sum = find_sum(number, 3) + find_sum(number, 5);

    System.out.println("The sum of all the multiples of 3 and 5 is : " + sum);
  }

  static int find_sum(int number, int multiple) {
    int howManyMultiples = (number - number % multiple) / multiple;// need to know how many times 3 or 5 goes into to number with no remainder
    return multiple * howManyMultiples * howManyMultiples - 1 / 2; // sum of n integers equals {(n * (n - 1)) / 2} + n
  }

}
