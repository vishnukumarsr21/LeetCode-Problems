import java.util.Scanner;

class Solution {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        while (left <= right) {
            long pivot = left + (right - left) / 2;
            long coinsUsed = pivot * (pivot + 1) / 2;
            if (coinsUsed == n) {
                return (int) pivot;
            }
            if (n < coinsUsed) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of coins: ");
        int n = scanner.nextInt();
        
        Solution solution = new Solution();
        int result = solution.arrangeCoins(n);
        
        System.out.println("The number of complete rows that can be formed: " + result);
        
        scanner.close();
    }
}
