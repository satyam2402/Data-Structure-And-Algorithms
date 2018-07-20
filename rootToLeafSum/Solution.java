package rootToLeafSum;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

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
    public static int sumNumbers(TreeNode A) {
        ArrayList<Long> al= new ArrayList<>();
        preorder(A, new Stack<Long>(),al);
        System.out.println(al);
        long sum=0;
        for(long i:al) {
            sum= sum+i;
        }
        return (int)sum%1003;
    }

    public static void preorder(TreeNode A, Stack<Long> stack, ArrayList<Long> al) {
        if(A==null) {
            return;
        }
        stack.push((long)A.val);
        if(A.left==null && A.right==null) {
            ArrayList<Long> a=new ArrayList<Long>(stack);
            System.out.println(a);
            int size=a.size();
            String sum="";
            for(int i=0;i<=size-1;i++) {
                sum=sum+Long.toString(a.get(i));
            }
            System.out.println("Sum:"+sum);
            al.add((long)new BigInteger(sum).mod(new BigInteger("1003")).intValue());
        }
        preorder(A.left, stack, al);
        preorder(A.right, stack, al);
        stack.pop();
    }

    public static void main(String args[]) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right= new TreeNode(3);
        root.right.left= new TreeNode(4);
        root.right.left.right= new TreeNode(5);
        System.out.println(sumNumbers(root));

    }

}
