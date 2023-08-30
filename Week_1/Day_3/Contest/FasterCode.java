package Week_1.Day_3.Contest;

import java.util.Scanner;

public class FasterCode {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int x = scan.nextInt();
  int y = scan.nextInt();

  if (x > y) {
   System.out.println("old");
  } else if (x < y) {
   System.out.println("new");
  } else {
   System.out.println("same");
  }
 }
}
