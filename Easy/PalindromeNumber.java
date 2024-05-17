import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int num = x;
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return x == rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        System.out.print("Enter the number of test cases: ");
        int n = scanner.nextInt();
        int[] testCases = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter test case " + (i + 1) + ": ");
            testCases[i] = scanner.nextInt();
        }
        
        for (int x : testCases) {
            boolean isPalin = solution.isPalindrome(x);
            System.out.println("Number: " + x + ", Is Palindrome: " + isPalin);
        }
        
        scanner.close();
    }
}
