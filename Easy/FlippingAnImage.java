import java.util.Scanner;

class Solution {
    public int[][] flipAndInvertImage(int[][] img) {
        int temp = 0;
        int n = img.length;
        for (int i = 0; i < n; i++) {
            int j = 0;
            int k = n - 1;
            while (j < k) {
                temp = img[i][j];
                img[i][j] = img[i][k];
                img[i][k] = temp;
                j++;
                k--;
            }
            for (int x = 0; x < n; x++) {
                img[i][x] = img[i][x] == 0 ? 1 : 0;
            }
        }
        return img;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();
        
        int[][] img = new int[n][n];
        System.out.println("Enter the elements of the matrix (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                img[i][j] = scanner.nextInt();
            }
        }
        
        Solution solution = new Solution();
        int[][] result = solution.flipAndInvertImage(img);
        
        System.out.println("The flipped and inverted image is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
