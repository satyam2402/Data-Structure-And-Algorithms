package invertingTree;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left;
    TreeNode right;
}
public class Solution {
    public TreeNode invertTree(TreeNode A) {
        if(A==null) {
            return A;
        }
        inorder(A);
        return A;
    }
    public void inorder(TreeNode A) {
        if(A==null) {
            return;
        }
        TreeNode temp;
        temp=A.left;
        A.left=A.right;
        A.right=temp;
        inorder(A.left);
        inorder(A.right);
    }

    public static void main(String args[]) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        Solution solution=new Solution();
        root=solution.invertTree(root);

        System.out.println(root.val);
        System.out.println(root.left.val);
        System.out.println(root.right.val);
    }

}
