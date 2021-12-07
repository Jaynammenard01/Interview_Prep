package even_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadyToCode {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a list of comma separated numbers e.g. 1,2,3");
    String nextLine = scanner.nextLine();
    List<Integer> numbers = new ArrayList<>();
    for (String str : nextLine.split(",")) {
      numbers.add(Integer.parseInt(str));
    }

    //your code here

  }
}
