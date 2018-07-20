package roottoleafpath;

import java.util.ArrayList;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left;
    TreeNode right;
}

public class Solution {
    ArrayList<Integer> al=new ArrayList<>();
    public int sumNumbers(TreeNode A) {
        int sum=0;
        if(A==null) {
            return sum;
        }
        preorder(A, 0);
        System.out.println(al);
        for(int i:al) {
            sum=sum+i;
        }
        al=new ArrayList<>();
        return sum%1003;
    }

    public void preorder(TreeNode node, int data) {
        if(node==null) {
            return;
        }
        data=(data*10+node.val)%1003;
        if(node.left==null && node.right==null) {
            al.add(data);
        }
        preorder(node.left,data);
        preorder(node.right, data);
    }
    public static void main(String ...args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
//        root.left.left=new TreeNode(4);
//        root.left.right=new TreeNode(5);
//        root.left.left.left=new TreeNode(6);
          root.right.left=new TreeNode(4);
          root.right.left.right=new TreeNode(5);
        Solution solution=new Solution();
        System.out.println(solution.sumNumbers(root));
    }
}