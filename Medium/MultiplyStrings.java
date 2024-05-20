import java.math.BigInteger;
import java.util.Scanner;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger c = a.multiply(b);
        return c.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        String num1 = scanner.nextLine();
        
        System.out.print("Enter the second number: ");
        String num2 = scanner.nextLine();
        
        Solution solution = new Solution();
        String result = solution.multiply(num1, num2);
        
        System.out.println("The product is: " + result);
        
        scanner.close();
    }
}
