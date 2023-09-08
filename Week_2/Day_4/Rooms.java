package Week_2.Day_4;

import java.util.Arrays;
import java.util.Scanner;

public class Rooms {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();

  for (int i = 0; i < t; i++) {
   int n = scan.nextInt();
   int[] d = new int[n];
   int[] s = new int[n];
   int[] eff = new int[n];
   for (int j = 0; j < n; j++) {
    d[j] = scan.nextInt();
    s[j] = scan.nextInt();
    eff[j] = ((s[j] - 1) / 2) + d[j];
   }

   Arrays.sort(eff);
   System.out.println(eff[0]);
  }
 }
}
