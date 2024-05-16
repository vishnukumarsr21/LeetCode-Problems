import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int[] arr = new int[a + b];
        int l = 0;
        
        // Merge both arrays into a single sorted array
        for (int i = 0; i < nums1.length; i++) {
            arr[l] = nums1[i];
            l++;
        }
        for (int j = 0; j < nums2.length; j++) {
            arr[l] = nums2[j];
            l++;
        }
        Arrays.sort(arr);
        
        // Calculate the median
        int mid = arr.length / 2;
        double median;
        
        if (arr.length % 2 != 0) {
            median = arr[mid]; // Odd number of elements
        } else {
            median = (arr[mid - 1] + arr[mid]) / 2.0; // Even number of elements
        }
        
        return median;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the elements of the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            nums1[i] = scanner.nextInt();
        }
        
        // Prompt user for the elements of the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            nums2[i] = scanner.nextInt();
        }
        
        // Use Solution class to find the median of the merged sorted arrays
        Solution solution = new Solution();
        double median = solution.findMedianSortedArrays(nums1, nums2);
        
        // Display the calculated median
        System.out.println("Median of the merged sorted arrays: " + median);
        
        scanner.close();
    }
}
