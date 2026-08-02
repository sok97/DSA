package recursion;

import java.util.*;

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

public class BinaryTreePaths {

    // Returns all root-to-leaf paths
    public static List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
    }

    private static void dfs(TreeNode root, String path, List<String> res) {
        if (root == null) {
            return;
        }

        if (path.isEmpty()) {
            path = String.valueOf(root.val);
        } else {
            path = path + "->" + root.val;
        }

        // Leaf node
        if (root.left == null && root.right == null) {
            res.add(path);
            return;
        }

        dfs(root.left, path, res);
        dfs(root.right, path, res);
    }

    public static void main(String[] args) {

        // Construct the tree:
        //       1
        //      / \
        //     2   3
        //      \
        //       5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> paths = binaryTreePaths(root);

        System.out.println(paths);
    }
}