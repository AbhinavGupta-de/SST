// package Week_1.Day_4;

import java.util.Scanner;

/**
 * Static_Range_Sum_Queries
 */
public class staticRangeSum {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int q = scan.nextInt();

  int[] arr = new int[n];
  for (int i = 0; i < n; i++) {
   arr[i] = scan.nextInt();
  }

  // n^2 iterations TLE
  // for (int i = 0; i < q; i++) {
  // int a = scan.nextInt();
  // int b = scan.nextInt();

  // long sum = 0;
  // for (int j = a; j <= b; j++) {
  // sum += arr[j - 1];
  // }

  // System.out.println(sum);
  // }

  // for (int i = 0; i < q; i++) {
  // String[] query = scan.nextLine().split(" ");
  // }

  // Chat GPT
  long[] prefixSum = new long[n + 1];
  prefixSum[0] = 0;
  for (int i = 1; i <= n; i++) {
   prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
  }

  for (int i = 0; i < q; i++) {
   int a = scan.nextInt();
   int b = scan.nextInt();

   long sum = prefixSum[b] - prefixSum[a - 1];
   System.out.println(sum);
  }

 }
}