import java.util.Scanner;

class Solution {
    public int numSteps(String s) {
        int n = s.length();
        int carry = 0;
        int ans = 0;
        for (int i = n - 1; i >= 1; i--) {
            if ((s.charAt(i) - '0' + carry) % 2 == 1) {
                ans += 2;
                carry = 1;
            } else {
                ans += 1;
            }
        }
        return ans + carry;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a binary string: ");
        String s = scanner.nextLine();
        
        Solution solution = new Solution();
        int result = solution.numSteps(s);
        
        System.out.println("The number of steps to reduce the binary string to '1' is: " + result);
        
        scanner.close();
    }
}
