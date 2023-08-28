package Week_1.Day_1;

import java.util.Scanner;

public class MissingNumber {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long n = scan.nextInt();

    long sumTrue = n * (n + 1) / 2;
    long sumCheck = 0;
    for (int i = 0; i < n - 1; i++) {
      sumCheck += scan.nextInt();
    }

    System.out.println(sumTrue - sumCheck);
  }
}
