package Week_2.Day_5;

import java.util.Scanner;

// public class IllyaQueries {
//  public static void main(String[] args) {
//   Scanner scan = new Scanner(System.in);
//   String str = scan.next();
//   int m = scan.nextInt();
//   int n = str.length();

//   // * Changing the string array to integer array
//   int[] arr = new int[n];
//   for (int i = 0; i < n; i++) {
//    if (str.charAt(i) == '.') {
//     arr[i] = 1;
//    } else {
//     arr[i] = 0;
//    }
//   }

//   // * To test the array
//   // System.out.println("Array is: ");
//   // for (int i = 0; i < n; i++) {
//   // System.out.print(arr[i] + " ");
//   // }

//   for (int i = 0; i < m; i++) {
//    int l = scan.nextInt();
//    int r = scan.nextInt();
//    int count = 0;
//    for (int j = l - 1; j < r - 1; j++) {
//     // System.out.println("ran");
//     if (arr[j] == arr[j + 1]) {
//      count++;
//     }
//    }
//    System.out.println(count);
//   }
//  }
// }

public class IllyaQueries {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String str = scan.next();
  int m = scan.nextInt();
  int n = str.length();

  // Changing the string array to integer array
  int[] arr = new int[n];
  for (int i = 0; i < n; i++) {
   if (str.charAt(i) == '.') {
    arr[i] = 1;
   } else {
    arr[i] = 0;
   }
  }

  int[] prefixSum = new int[n];
  prefixSum[0] = 0;
  for (int i = 1; i < n; i++) {
   prefixSum[i] = prefixSum[i - 1] + (arr[i] == arr[i - 1] ? 1 : 0);
  }

  for (int i = 0; i < m; i++) {
   int l = scan.nextInt();
   int r = scan.nextInt();
   int count = 0;
   if (l > 0) {
    count = prefixSum[r - 1] - prefixSum[l - 1];
   }
   if (l == 0) {
    count = prefixSum[r - 1];
   }

   System.out.println(count);
  }
 }
}
