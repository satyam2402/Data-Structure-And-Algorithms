package symmetricbinarytree;


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) {
         val = x;
      left=null;
      right=null; }
  }
public class Solution {
    public int isSymmetric(TreeNode A) {
        if(A==null) {
            return 1;
        } else {
            boolean ans=symmetric(A.left, A.right);
            if(ans==true) {
                return 1;
            } else {
                return  0;
            }
        }
    }

    public boolean symmetric(TreeNode A, TreeNode B) {
        if(A==null && B==null) {
            return true;
        } else if(A!=null && B!=null) {
            return (A.val==B.val && symmetric(A.left,B.right) && symmetric(A.right,B.left));
        } else {
            return false;
        }
    }
}