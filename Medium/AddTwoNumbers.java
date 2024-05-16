import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Prompt user for target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        
        // Use Solution class to find indices
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        
        // Display result
        if (result[0] != 0 || result[1] != 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Elements: " + nums[result[0]] + ", " + nums[result[1]]);
        } else {
            System.out.println("No two sum solution found.");
        }
        
        scanner.close();
    }
}
