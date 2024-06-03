import java.util.Scanner;

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int a = Integer.bitCount(n);
        return a == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        boolean result = solution.isPowerOfTwo(n);
        
        System.out.println("Is the number a power of two? " + result);
        
        scanner.close();
    }
}
