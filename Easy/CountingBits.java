import java.util.Scanner;

class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = Integer.bitCount(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        int[] result = solution.countBits(n);
        
        System.out.println("The count of 1 bits for each number from 0 to " + n + " is:");
        for (int i = 0; i <= n; i++) {
            System.out.println(i + ": " + result[i]);
        }
        
        scanner.close();
    }
}
