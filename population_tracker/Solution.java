package population_tracker;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public static Map<String,Integer> tracker = new HashMap<>();

  public static void main(String[] args) {
    populationTracker("USA", 331002651);
    populationTracker("China", 1439323776);
    populationTracker("India", 1380004385);
  }

  private static void populationTracker(String country, int population) {
    tracker.put(country,population);
    System.out.println(tracker);
  }

  /*
  The issue in the Buggy class is a new map is being created in the population method instead of using the map named tracker.
   */

}
