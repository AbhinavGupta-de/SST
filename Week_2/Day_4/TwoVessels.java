package Week_2.Day_4;

import java.io.IOException;
import java.util.Scanner;

public class TwoVessels {
 public static void main(String[] args) throws IOException {
  Scanner scan = new Scanner(System.in);
  int t = scan.nextInt();

  for (int i = 0; i < t; i++) {
   int a = scan.nextInt();
   int b = scan.nextInt();
   double c = scan.nextDouble();

   int max = a;
   if (max < b) {
    max = b;
   }

   int min = a;
   if (min > b) {
    min = b;
   }
   double ans = (max - min) / (2 * c);
   System.out.println((int) Math.ceil(ans));
  }

 }
}
