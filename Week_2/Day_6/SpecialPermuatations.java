package Week_2.Day_6;

import java.util.Scanner;

public class SpecialPermuatations {

 public static void reverse(int[] arr) {
  int start = 0;
  int end = arr.length - 1;
  while (start < end) {
   int temp = arr[start];
   arr[start] = arr[end];
   arr[end] = temp;
   start++;
   end--;
  }
 }

 // public static int howManyLarger(int[] arr, int num) {
 // int count = 0;
 // for (int i = 0; i < arr.length; i++) {
 // if (arr[i] > num) {
 // count++;
 // }
 // }
 // return count;
 // }

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int t = s.nextInt();

  for (int i = 0; i < t; i++) {
   int n = s.nextInt();
   int a = s.nextInt();
   int b = s.nextInt();

   int[] arr = new int[n];
   for (int j = 0; j < n; j++) {
    arr[j] = j + 1;
   }

   if (b < (n / 2) || a > (n / 2) + 1) {
    // System.out.println(howManyLarger(arr, b));
    System.out.println(-1);
   } else if (a < b && (b == n / 2 || a == n / 2 + 1)) {
    System.out.println(-1);
   } else {

    if (n == 2 && a == 2 && b == 1) {
     System.out.println(2 + " " + 1);
     continue;
    }

    if (a > b) {
     reverse(arr);
    } else {
     int temp = arr[a - 1];
     arr[a - 1] = arr[b - 1];
     arr[b - 1] = temp;
     reverse(arr);
    }

    for (int j = 0; j < arr.length; j++) {
     System.out.print(arr[j] + " ");
    }
    System.out.println();
   }

  }
 }
}
