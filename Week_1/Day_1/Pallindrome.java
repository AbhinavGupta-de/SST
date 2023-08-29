// package Week_1.Day_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallindrome {
 public static void main(String[] args) throws IOException {
  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
  String input = bufferedReader.readLine();

  int[] nums = new int[26];
  for (int i = 0; i < input.length(); i++) {
   nums[input.charAt(i) - 'A']++;
  }

  int oddCount = 0;
  for (int i = 0; i < 26; i++) {
   if (nums[i] % 2 != 0) {
    oddCount++;
   }
  }
  if (oddCount > 1) {
   System.out.println("NO SOLUTION");
  } else {

   for (int i = 0; i < 26; i++) {
    if (nums[i] % 2 == 0) {
     for (int j = 0; j < nums[i] / 2; j++) {
      System.out.print((char) (i + 'A'));
     }
    }
   }

   for (int i = 0; i < 26; i++) {
    if (nums[i] % 2 != 0) {
     System.out.print((char) (i + 'A'));
     nums[i]--;
    }
   }

   for (int i = 25; i >= 0; i--) {
    if (nums[i] % 2 == 0) {
     for (int j = 0; j < nums[i] / 2; j++) {
      System.out.print((char) (i + 'A'));
     }
    }
   }

  }

 }
}
