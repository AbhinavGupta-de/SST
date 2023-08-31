import java.util.Scanner;

public class equillibriumIndex {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();

  for (int i = 0; i < t; i++) {
   int n = scan.nextInt();
   int[] nums = new int[n];
   for (int j = 0; j < n; j++) {
    nums[j] = scan.nextInt();
   }

   long[] prefixSum = new long[n + 1];
   prefixSum[0] = 0;
   for (int j = 1; j <= n; j++) {
    prefixSum[j] = prefixSum[j - 1] + nums[j - 1];
   }

   for (int j = 0; j < n; j++) {
    long leftSum = prefixSum[j];
    long rightSum = prefixSum[n] - prefixSum[j + 1];

    if (leftSum == rightSum) {
     System.out.println(j);
     break;
    }

   }
  }
  scan.close();
 }
}
