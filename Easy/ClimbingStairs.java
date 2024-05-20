import java.util.Scanner;

class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of steps: ");
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        int result = solution.climbStairs(n);
        
        System.out.println("Number of ways to climb the stairs: " + result);
        
        scanner.close();
    }
}
