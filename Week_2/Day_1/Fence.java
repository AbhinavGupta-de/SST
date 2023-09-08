package Week_2.Day_1;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Fence {

//     public static int[] computePrefixSum(int[] arr) {
//         int n = arr.length;
//         int[] prefixSum = new int[n];

//         // The first element of the prefix sum array is the same as the input array
//         prefixSum[0] = arr[0];

//         // Compute the cumulative sum for the remaining elements
//         for (int i = 1; i < n; i++) {
//             prefixSum[i] = prefixSum[i - 1] + arr[i];
//         }

//         return prefixSum;
//     }

//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String input = br.readLine();

//         String[] inputInts = input.split(" ");

//         int n = Integer.parseInt(inputInts[0]);
//         int k = Integer.parseInt(inputInts[1]);

//         int[] heights = new int[n];
//         input = br.readLine();
//         inputInts = input.split(" ");

//         for (int i = 0; i < n; i++) {
//             heights[i] = Integer.parseInt(inputInts[i]);
//         }

//         int[] prefixSum = computePrefixSum(heights);

//         int maxIndex = prefixSum.length - k;
//         int minIndex = 0;
//         int minSum = Integer.MAX_VALUE;
//         for (int i = 0; i < maxIndex; i++) {
//             int sum = prefixSum[i + k - 1] - prefixSum[i] + heights[i];
//             if (sum < minSum) {
//                 minSum = sum;
//                 minIndex = i;
//             }
//         }

//         System.out.println(minIndex + 1);

//     }

// }

import java.util.Scanner;

public class Fence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] heights = new int[n];
        int[] prefixSum = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
            if (i == 0) {
                prefixSum[i] = heights[i];
            } else {
                prefixSum[i] = prefixSum[i - 1] + heights[i];
            }
        }

        int minSum = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i <= n - k; i++) {
            int sum;
            if (i == 0) {
                sum = prefixSum[i + k - 1];
            } else {
                sum = prefixSum[i + k - 1] - prefixSum[i - 1];
            }

            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }
        }

        System.out.println(minIndex + 1);
        scanner.close();
    }
}
