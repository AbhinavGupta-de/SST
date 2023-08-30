package Week_1.Day_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TPrimes {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int n = Integer.parseInt(br.readLine());
  String[] str = br.readLine().split(" ");

  for (int i = 0; i < n; i++) {
   long num = Long.parseLong(str[i]);
   if (num == 1)
    System.out.println("NO");
   else if (num == 4)
    System.out.println("YES");
   else if (num % 2 == 0)
    System.out.println("NO");
   else {
    long sqrt = (long) Math.sqrt(num);
    if (sqrt * sqrt == num)
     System.out.println("YES");
    else
     System.out.println("NO");
   }
  }

 }
}
