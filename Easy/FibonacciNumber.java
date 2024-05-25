import java.util.Scanner;

class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        int result = solution.fib(n);
        
        System.out.println("The " + n + "th Fibonacci number is: " + result);
        
        scanner.close();
    }
}
