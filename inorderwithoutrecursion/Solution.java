package inorderwithoutrecursion;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left;
    TreeNode right;
}
public class Solution {
    public static ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> res=new ArrayList<>();
        if(A==null) {
            return res;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=A;
        while (curr!=null || stack.size()>0) {
            while(curr!=null) {
                stack.push(curr);
                curr=curr.left;
            }
            curr= stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }
    public static void main(String args[]) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        System.out.println(inorderTraversal(root));
    }
}

