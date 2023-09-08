package Week_2.Day_4;

public class EvenDigits {
 public static void main(String[] args) {
  int[] nums = { 12, 345, 2, 6, 7896 };
  EvenDigits ed = new EvenDigits();
  System.out.println(ed.findNumbers(nums));
 }

 public int findNumbers(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++) {
   String num = Integer.toString(nums[i]);
   if (num.length() % 2 == 0) {
    count++;
   }
  }
  return count;
 }
}
