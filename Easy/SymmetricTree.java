import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean f(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        }
        if (l == null || r == null) {
            return false;
        }
        if (l.val != r.val) {
            return false;
        }
        return f(l.left, r.right) && f(l.right, r.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return f(root.left, root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values of the tree nodes level by level, separated by spaces. Use 'null' for empty nodes:");
        String[] values = scanner.nextLine().split(" ");
        
        TreeNode root = buildTree(values);
        
        Solution solution = new Solution();
        boolean result = solution.isSymmetric(root);
        
        System.out.println("The tree is symmetric: " + result);
        
        scanner.close();
    }

    // Helper function to build a tree from input values
    public static TreeNode buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;

        while (!queue.isEmpty() && index < values.length) {
            TreeNode current = queue.poll();

            if (index < values.length && !values[index].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(values[index]));
                queue.add(current.left);
            }
            index++;

            if (index < values.length && !values[index].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(values[index]));
                queue.add(current.right);
            }
            index++;
        }

        return root;
    }
}
