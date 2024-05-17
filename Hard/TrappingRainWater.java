import java.util.Scanner;

class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];
        int max = 0;

        // Fill lmax array
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            lmax[i] = max;
        }

        max = 0;
        // Fill rmax array
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rmax[i] = max;
        }

        int sum = 0;
        // Calculate trapped water
        for (int i = 0; i < height.length; i++) {
            int min = Math.min(lmax[i], rmax[i]);
            int d = min - height[i];
            sum += d;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        System.out.print("Enter the number of elements in the height array: ");
        int n = scanner.nextInt();
        int[] height = new int[n];

        System.out.println("Enter the elements of the height array:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        int trappedWater = solution.trap(height);
        System.out.println("The total amount of trapped water is: " + trappedWater);
        
        scanner.close();
    }
}
