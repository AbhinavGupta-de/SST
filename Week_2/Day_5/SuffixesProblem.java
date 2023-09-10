package Week_2.Day_5;

import java.util.*;

public class SuffixesProblem {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int m = scan.nextInt();

  // int[] arr = new int[n];
  // for (int i = 0; i < n; i++) {
  // arr[i] = scan.nextInt();
  // }

  // * Preffix Sum Array
  // int[] prefixSum = new int[n];
  // prefixSum[0] = arr[0];
  // for (int i = 1; i < n; i++) {
  // prefixSum[i] = prefixSum[i - 1] + arr[i];
  // }

  // * Set Method -> This is wrongs as the duplicates are removed we don't which
  // * index we are starting or ending at also we don't know which elements we
  // * want.
  // Set<Integer> set = new HashSet<>();
  // for (int i = 0; i < n; i++) {
  // set.add(scan.nextInt());
  // }

  // for (int i = 0; i < m; i++) {
  // int x = scan.nextInt();
  // System.out.println(set.size() - x + 1);
  // }

 }
}
