import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TwoSets {
 public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  long n = Integer.parseInt(br.readLine());
  long sum = n * (n + 1) / 2;

  if (sum % 2 != 0) {
   System.out.println("NO");
  } else {
   System.out.println("YES");

   long halfSum = sum / 2;
   long halfCount = 0;
   ArrayList<Long> set1 = new ArrayList<>();
   ArrayList<Long> set2 = new ArrayList<>();

   for (long i = n; i > 0; i--) {
    if (halfCount + i <= halfSum) {
     set1.add(i);
     halfCount += i;
    } else {
     set2.add(i);
    }
   }

   System.out.println(set1.size());
   for (int i = 0; i < set1.size(); i++) {
    System.out.print(set1.get(i) + " ");
   }
   System.out.println();
   System.out.println(set2.size());
   for (int i = 0; i < set2.size(); i++) {
    System.out.print(set2.get(i) + " ");
   }

  }
 }
}
