import java.util.Scanner;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            int t = n & 1;
            int f = t << (31 - i);
            rev = rev | f;
            n = n >> 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer to reverse its bits: ");
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        int result = solution.reverseBits(n);
        
        System.out.println("The reversed bits integer is: " + result);
        
        scanner.close();
    }
}
