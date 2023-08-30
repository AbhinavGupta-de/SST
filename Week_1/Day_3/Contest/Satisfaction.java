package Week_1.Day_3.Contest;

import java.util.Scanner;

public class Satisfaction {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();

  for (int i = 0; i < n; i++) {
   int l = scan.nextInt();
   int r = scan.nextInt();
   int m = scan.nextInt();

   int sum = (int) Math.ceil(m / l) + m / r;
   System.out.println(sum);
  }

 }
}
