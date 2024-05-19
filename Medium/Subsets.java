import java.util.*;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> tempList = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        helper(nums, result, tempList, index);
        return result;
    }

    private void helper(int[] nums, List<List<Integer>> result, List<Integer> tempList, int index) {
        result.add(new ArrayList<>(tempList));
        for (int i = index; i < nums.length; i++) {
            tempList.add(nums[i]);
            helper(nums, result, tempList, i + 1);
            tempList.remove(tempList.size() - 1);
        }
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

        Solution solution = new Solution();
        List<List<Integer>> result = solution.subsets(nums);

        System.out.println("All possible subsets are:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }

        scanner.close();
    }
}
