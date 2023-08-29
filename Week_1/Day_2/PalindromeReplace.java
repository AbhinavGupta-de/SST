package Week_1.Day_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Problem statement: https://codeforces.com/group/MWSDmqGsZm/contest/223206/problem/A

public class PalindromeReplace {

 public static boolean isPallindrome(String str) {
  int n = str.length();
  for (int i = 0; i < n / 2; i++) {
   if (str.charAt(i) != str.charAt(n - 1 - i))
    return false;
  }
  return true;
 }

 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  String str = br.readLine();
  String pallindrome = "";

  for (int i = 0; i < str.length(); i++) {
   if (str.charAt(i) != '?')
    pallindrome += str.charAt(i);
   else if (str.charAt(i) == '?') {
    int n = str.length();
    if (str.charAt(n - 1 - i) != '?')
     pallindrome += str.charAt(n - 1 - i);
    else
     pallindrome += 'a';
   }
  }

  if (isPallindrome(pallindrome))
   System.out.println(pallindrome);
  else
   System.out.println(-1);
 }
}