import java.util.Scanner;

class Solution {
    public char findTheDifference(String s, String t) {
        int a = 0;
        for (int i : t.toCharArray()) {
            a += i;
        }
        for (int i : s.toCharArray()) {
            a -= i;
        }
        return (char) a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string s: ");
        String s = scanner.nextLine();
        
        System.out.print("Enter the second string t: ");
        String t = scanner.nextLine();
        
        Solution solution = new Solution();
        char result = solution.findTheDifference(s, t);
        
        System.out.println("The added character is: " + result);
        
        scanner.close();
    }
}
