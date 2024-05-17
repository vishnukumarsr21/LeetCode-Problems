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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Enter the number of nodes in tree 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the values of tree 1 nodes in level order (use -1 for null nodes): ");
        TreeNode tree1 = createTree(scanner, n1);

        System.out.println("Enter the number of nodes in tree 2: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter the values of tree 2 nodes in level order (use -1 for null nodes): ");
        TreeNode tree2 = createTree(scanner, n2);

        boolean result = solution.isSameTree(tree1, tree2);
        System.out.println("The trees are the same: " + result);

        scanner.close();
    }

    private static TreeNode createTree(Scanner scanner, int n) {
        if (n == 0) {
            return null;
        }

        TreeNode root = new TreeNode(scanner.nextInt());
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        for (int i = 1; i < n; i++) {
            TreeNode current = queue.poll();

            int leftVal = scanner.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }

            if (i + 1 < n) {
                int rightVal = scanner.nextInt();
                i++;
                if (rightVal != -1) {
                    current.right = new TreeNode(rightVal);
                    queue.add(current.right);
                }
            }
        }

        return root;
    }
}
