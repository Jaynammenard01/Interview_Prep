package find_maximum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buggy {

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
      max = 0;
      if(i > max) {
        max = i;
      }
    }
    System.out.println("Maximum number of array is : "
        + max);
  }
}
