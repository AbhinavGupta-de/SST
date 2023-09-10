package Week_2.Day_5;

import java.util.*;

public class ArrayManipulation {

 /*
  * Complete the 'arrayManipulation' function below.
  *
  * The function is expected to return a LONG_INTEGER.
  * The function accepts following parameters:
  * 1. INTEGER n
  * 2. 2D_INTEGER_ARRAY queries
  */

 // * n^2 iterations!!
 // public static long arrayManipulation(int n, List<List<Integer>> queries) {
 // long[] arr = new long[n];
 // long max = Long.MIN_VALUE;
 // for (int i = 0; i < queries.size(); i++) {
 // for (int j = queries.get(i).get(0) - 1; j < queries.get(i).get(1); j++) {
 // arr[j] += queries.get(i).get(2);
 // max = Math.max(max, arr[j]);
 // }
 // }

 // return max;
 // }
 public static long arrayManipulation(int n, List<List<Integer>> queries) {
  long[] arr = new long[n + 1]; // Initialize an array of size n+1
  long max = Long.MIN_VALUE;

  // Process each query and update the prefix sum array
  for (int i = 0; i < queries.size(); i++) {
   int a = queries.get(i).get(0);
   int b = queries.get(i).get(1);
   long k = queries.get(i).get(2);

   arr[a - 1] += k; // Add k to the start of the range
   arr[b] -= k; // Subtract k from the element after the end of the range
  }

  long prefixSum = 0;
  // Calculate the prefix sum and find the maximum value
  for (int i = 0; i < n; i++) {
   prefixSum += arr[i];
   max = Math.max(max, prefixSum);
  }

  return max;
 }

}
