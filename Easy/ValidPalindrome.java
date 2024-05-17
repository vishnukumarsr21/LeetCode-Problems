import java.util.Scanner;

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String s1 = sb.toString();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != s1.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        boolean result = solution.isPalindrome(input);
        System.out.println("The string is a palindrome: " + result);
        
        scanner.close();
    }
}
