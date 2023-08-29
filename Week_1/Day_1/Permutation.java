import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Permutation {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  PrintWriter pr = new PrintWriter(System.out);

  int n = Integer.parseInt(br.readLine());
  if (n == 1)
   pr.print(1);
  else if (n <= 3)
   pr.write("NO SOLUTION");
  else {
   for (int i = 2; i <= n; i += 2)
    pr.print(i + " ");
   for (int i = 1; i <= n; i += 2)
    pr.print(i + " ");
  }
  pr.flush();

 }
}
