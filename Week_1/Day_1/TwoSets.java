import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSets {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int n = Integer.parseInt(br.readLine());
  int sum = n * (n + 1) / 2;

  if (sum % 2 != 0) {
   System.out.println("NO SOLUTION");
  } else {
   int halfSum = sum / 2;

  }
 }
}
