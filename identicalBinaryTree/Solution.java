package identicalBinaryTree;



 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }

public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        boolean ans=sameTree(A, B) ;
        if(ans==false) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean sameTree(TreeNode A, TreeNode B) {
        if(A==null && B==null) {
            return true;
        }else if(A!=null && B!=null) {
            return A.val==B.val && sameTree(A.left,B.left) && sameTree(A.right, B.right);
        }
        return false;
    }
}