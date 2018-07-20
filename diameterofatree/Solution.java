package diameterofatree;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left;
    TreeNode right;
}

public class Solution {
    public static int diameter= Integer.MIN_VALUE;
    public static int getDiameter(TreeNode root) {
        if(root==null) {
            return 0;
        }
        preorder(root);
        return diameter;
    }
    public static void preorder(TreeNode root) {
        if(root==null) {
            return;
        }
        if(height(root.left)+height(root.right)+1>diameter) {
            diameter= height(root.left)+height(root.right)+1;
        }
        preorder(root.left);
        preorder(root.right);
    }

    public static int height(TreeNode treeNode) {
        if(treeNode==null) {
            return 0;
        }
        return 1+ Math.max(height(treeNode.left), height(treeNode.right));
    }

    public static void main(String... args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        System.out.print(getDiameter(tree));

    }
}