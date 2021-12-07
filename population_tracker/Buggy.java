package population_tracker;

import java.util.HashMap;
import java.util.Map;

public class Buggy {

  public static Map<String,Integer> tracker = new HashMap<>();

  public static void main(String[] args) {
    populationTracker("USA", 331002651);
    populationTracker("China", 1439323776);
    populationTracker("India", 1380004385);
    System.out.println(tracker);
  }

  private static void populationTracker(String country, int population) {
    Map<String,Integer> temp = new HashMap<>();
    temp.put(country,population);
    tracker = temp;
  }
}
