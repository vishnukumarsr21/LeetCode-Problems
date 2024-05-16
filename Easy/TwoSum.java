import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                arr[0] = map.get(complement);
                arr[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        
        if (result[0] != 0 || result[1] != 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Elements: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
