package Week_1.Day_3.Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * MaximumDeliciousness
 */
public class MaximumDeliciousness {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();

  for (int i = 0; i < n; i++) {
   int m = scan.nextInt();
   int k = scan.nextInt();
   int l = scan.nextInt();

   ArrayList<Integer> arr = new ArrayList<>();
   for (int j = 0; j < m; j++) {
    arr.add(scan.nextInt());
   }
   Collections.sort(arr);

   int terms = ((m - l) / k) + 1;

   int sum = 0;
   for (int j = 0; j < terms; j++) {
    int index = l + j * k - 1;
    sum += arr.get(m - index - 1);
   }

   System.out.println(sum);
  }
 }
}