package recursion;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class pathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    private static boolean dfs(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }

        return dfs(root.left, sum - root.val)
                || dfs(root.right, sum - root.val);
    }

    public static void main(String[] args) {

        // Construct the tree:
        //         5
        //        / \
        //       4   8
        //      /   / \
        //     11  13  4
        //    /  \
        //   7    2

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        int targetSum = 22;

        System.out.println(hasPathSum(root, targetSum)); // true
    }
}