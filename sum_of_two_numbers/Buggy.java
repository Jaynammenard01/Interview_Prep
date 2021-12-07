package sum_of_two_numbers;

import java.util.Scanner;

public class Buggy {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the first number");
    int a = scanner.nextInt();
    System.out.println("Please enter the second number");
    int b = scanner.nextInt();

    System.out.println("The sum is: " + a + b);
  }
}
