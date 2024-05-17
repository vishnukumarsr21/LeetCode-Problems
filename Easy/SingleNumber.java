import java.util.Scanner;

class Solution {
    public int singleNumber(int[] nums) {
        int val = 0;
        for (int num : nums) {
            val = val ^ num;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int singleNumber = solution.singleNumber(nums);
        System.out.println("The single number is: " + singleNumber);

        scanner.close();
    }
}
