package even_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buggy {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a list of comma separated numbers e.g. 1,2,3");
    String nextLine = scanner.nextLine();
    List<Integer> numbers = new ArrayList<>();
    for (String str : nextLine.split(",")) {
      numbers.add(Integer.parseInt(str));
    }

    List<Integer> evens = new ArrayList<>();
    for (Integer i : numbers) {
      if (i / 2 == 0) {
        evens.add(i);
      }
    }

    System.out.println("The even numbers are: " + evens);
  }
}
