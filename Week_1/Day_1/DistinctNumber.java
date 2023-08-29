// package Week_1.Day_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DistinctNumber {
 public static void main(String[] args) throws IOException {
  // Scanner scan = new Scanner(System.in);
  // int n = scan.nextInt();

  // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  // int n = Integer.parseInt(br.readLine());
  // Set<Integer> set = new HashSet<>();
  // for (int i = 0; i < n; i++) {
  // set.add(scan.nextInt());
  // }

  // String[] line = br.readLine().split(" ");
  // int[] nums = new int[n];

  // for (int i = 0; i < n; i++) {
  // nums[i] = Integer.parseInt(line[i]);
  // }

  // Arrays.sort(nums);

  // int count = 0;
  // for (int i = 0; i < n - 1; i++) {
  // if (nums[i] != nums[i + 1]) {
  // count++;
  // }
  // }

  // for (int i = 0; i < n; i++) {
  // nums[i] = Integer.parseInt(br.readLine());
  // }

  // System.out.println(count + 1);

  // System.out.println(set.size());

  try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
   int n = Integer.parseInt(br.readLine());
   String[] line = br.readLine().split(" ");
   int[] nums = new int[n];

   for (int i = 0; i < n; i++) {
    nums[i] = Integer.parseInt(line[i]);
   }

   Arrays.sort(nums);

   int count = 0;
   for (int i = 0; i < n - 1; i++) {
    if (nums[i] != nums[i + 1]) {
     count++;
    }
   }

   System.out.println(count + 1);
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
