package find_maximum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a list of comma separated numbers eg 1,2,3");
    String nextLine = scanner.nextLine();
    List<Integer> numbers = new ArrayList<>();
    for (String str: nextLine.split(",")) {
      numbers.add(Integer.parseInt(str));
    }

    int max = 0;

    for (int i : numbers) {
      if(i > max) {
        max = i;
      }
    }

    System.out.println("Maximum number of array is : "
        + max);
  }

  /*
  The issue in the buggy class is that max is set to 0 inside the loop every time.
   */
}
