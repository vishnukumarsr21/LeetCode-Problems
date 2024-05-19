import java.util.*;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<>(), nums);
        return list;
    }

    private void helper(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
        } else {
            for (int i : nums) {
                if (temp.contains(i)) {
                    continue;
                }
                temp.add(i);
                helper(list, temp, nums);
                temp.remove(temp.size() - 1);
            }
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
        List<List<Integer>> result = solution.permute(nums);

        System.out.println("All possible permutations are:");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }

        scanner.close();
    }
}
