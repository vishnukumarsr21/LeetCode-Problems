import java.util.Scanner;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int i = 0;
        int j = x - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (mid * mid == x) {
                return mid;
            }
            if ((long) mid * mid < (long) x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();
        
        Solution solution = new Solution();
        int result = solution.mySqrt(x);
        
        System.out.println("The integer square root of " + x + " is: " + result);
        
        scanner.close();
    }
}
