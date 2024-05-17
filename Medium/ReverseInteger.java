import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        long f = 0;
        while (x != 0) {
            int l = x % 10;
            f += l;
            f = f * 10;
            x = x / 10;
        }
        f = f / 10;
        if (f > Integer.MAX_VALUE || f < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)f;
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
            int reversed = solution.reverse(x);
            System.out.println("Original: " + x + ", Reversed: " + reversed);
        }
        
        scanner.close();
    }
}
