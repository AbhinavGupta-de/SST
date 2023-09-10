package Week_2.Day_1;

import java.util.Scanner;

// import java.util.Scanner;

// public class CountingTest {
//  public static void main(String[] args) {
//   Scanner scan = new Scanner(System.in);
//   int t = scan.nextInt();

//   for (int i = 0; i < t; i++) {
//    int n = scan.nextInt();
//    int q = scan.nextInt();

//    int[] prefixSum = new int[n];

//    String input = scan.next();

//    for (int j = 0; j < q; j++) {

//     int l = scan.nextInt() - 1;
//     int r = scan.nextInt() - 1;

//     while (r > input.length()) {
//      input += input;
//     }

//     for (int k = 0; k < r; k++) {
//      if (j == 0) {
//       prefixSum[k] = (int) input.charAt(k);
//      } else {
//       prefixSum[k] = prefixSum[j] + (int) input.charAt(k);
//      }
//     }

//     // int l = scan.nextInt();
//     // int r = scan.nextInt();
//     char c = scan.next().charAt(0);

//     int num = (prefixSum[r] - prefixSum[l]) / (int) c;
//     System.out.println(num);
//    }

//   }
//  }
// }

/**
 * CountingTest
 */

// This does work but TLE!!!
public class CountingTest {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();

  for (int i = 0; i < t; i++) {
   int n = scan.nextInt();
   int q = scan.nextInt();

   String input = scan.next();

   for (int j = 0; j < q; j++) {

    int l = scan.nextInt() - 1;
    int r = scan.nextInt() - 1;

    while (r > input.length()) {
     input += input;
    }

    char c = scan.next().charAt(0);

    int count = 0;

    for (int k = l; k <= r; k++) {
     if (input.charAt(k) == c) {
      count++;
     }
    }

    System.out.println(count);
   }

  }
 }
}

/*
 * // This one should be optimized
 * public class CountingTest {
 * 
 * public static void main(String[] args) throws IOException {
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * int t = Integer.parseInt(br.readLine());
 * 
 * for (int i = 0; i < t; i++) {
 * String[] input = br.readLine().split(" ");
 * int n = Integer.parseInt(input[0]);
 * int q = Integer.parseInt(input[1]);
 * 
 * String s = br.readLine();
 * 
 * for (int j = 0; j < q; j++) {
 * String[] query = br.readLine().split(" ");
 * int l = Integer.parseInt(query[0]) - 1;
 * int r = Integer.parseInt(query[1]);
 * char c = query[2].charAt(0);
 * 
 * while (r > s.length()) {
 * s += s;
 * }
 * 
 * // // Using the prefix sum technique
 * 
 * // int[] prefixSum = new int[r + 1];
 * // int count = 0;
 * // for (int k = l; k < r; k++) {
 * // if (count == 0) {
 * // prefixSum[count] = (int) s.charAt(k);
 * // } else {
 * // prefixSum[count] = prefixSum[count - 1] + (int) s.charAt(k);
 * // }
 * // count++;
 * // }
 * 
 * int count = 0;
 * 
 * for (int k = l; k <= r; k++) {
 * if (s.charAt(k) == c) {
 * count++;
 * }
 * }
 * 
 * // int num = (prefixSum[r - 1] - prefixSum[l]) / (int) c;
 * 
 * // System.out.println(num - 1);
 * // }
 * 
 * }
 * }
 * }
 * }
 * 
 */