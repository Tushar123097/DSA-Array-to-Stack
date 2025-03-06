import java.util.*;
public class Main {
  public static void main(String[] args) {
      Solution solution = new Solution();
      int[] arr = {4, 2, 1, 5, 9};
      int target = 5;
      
      int result = solution.linearSearch(arr, target);
      System.out.println(result); // Output: 3
  }
}
