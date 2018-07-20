package childrensumproperty;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left;
    TreeNode right;
}

public class Solution {
    static boolean result=true;
    public static void childrenSumProperty(TreeNode node) {
        preordertraversal(node);
    }

    public static void preordertraversal(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) {
            return;
        }
       if(root.left!=null && root.right!=null && (root.left.val+root.right.val==root.val)) {
            result= true;
        } else if(root.left!=null && root.right==null && root.val==root.left.val) {
            result=true;
        } else if(root.right!=null && root.left==null && root.val==root.right.val ) {
            result=true;
       } else {
            result=false;
            return;
       }
        preordertraversal(root.left);
        preordertraversal(root.right);
    }

    public static void main(String... args) {
        TreeNode tree = new TreeNode(10);
        tree.left = new TreeNode(8);
        tree.right = new TreeNode(2);
        tree.left.left = new TreeNode(3);
        tree.left.right = new TreeNode(5);
        tree.right.right = new TreeNode(2);
        childrenSumProperty(tree);
        System.out.print(result);

    }
}

