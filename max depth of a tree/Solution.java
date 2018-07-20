package maxdepthofatree;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left;
    TreeNode right;
}
public class Solution {
    public int maxDepth(TreeNode A) {
        if(A==null) {
            return 0;
        } else {
            return 1+Math.max(maxDepth(A.left),maxDepth(A.right));
        }
    }
    public static void main(String args[]) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        Solution solution=new Solution();
        System.out.println(solution.maxDepth(root));
    }
}
