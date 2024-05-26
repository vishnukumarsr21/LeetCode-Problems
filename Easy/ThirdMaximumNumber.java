import java.util.Scanner;
import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length <= 2) {
            int max = nums[0];
            for (int num : nums) {
                max = Math.max(max, num);
            }
            return max;
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() == 3 ? set.first() : set.last();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        int result = solution.thirdMax(nums);
        
        System.out.println("The third maximum number is: " + result);
        
        scanner.close();
    }
}
