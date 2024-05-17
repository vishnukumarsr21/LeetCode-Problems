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
        Solution solution = new Solution();
        
        // Test cases
        int[] testCases = {123, -123, 120, 0, 1534236469, -2147483648};
        
        for (int x : testCases) {
            int reversed = solution.reverse(x);
            System.out.println("Original: " + x + ", Reversed: " + reversed);
        }
    }
}
