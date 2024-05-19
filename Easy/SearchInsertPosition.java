import java.util.*;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                k = i;
                break;
            } else if (target > nums[i]) {
                k = i + 1;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        Solution solution = new Solution();
        int position = solution.searchInsert(nums, target);

        System.out.println("The target value should be inserted at position: " + position);

        scanner.close();
    }
}
