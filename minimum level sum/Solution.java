package minimumlevelsum;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left;
    TreeNode right;
}

public class Solution {

    public static int minlevelsum(TreeNode treeNode) {
        if(treeNode==null) {
            return 0;
        }
        Queue<TreeNode> curQue= new LinkedList<>();
        Queue<TreeNode> futQue= new LinkedList<>();
        curQue.add(treeNode);
        int min=treeNode.val;
        while(curQue.size()>0){
            TreeNode node= curQue.remove();
            if(node.left!=null) {
                futQue.add(node.left);
            }
            if(node.right!=null) {
                futQue.add(node.right);
            }
            if(curQue.size()==0 && futQue.size()>0) {
                Iterator<TreeNode> nodeIterator=futQue.iterator();
                int sum=0;
                while(nodeIterator.hasNext()) {
                    sum=sum+nodeIterator.next().val;
                }
                if(sum<min) {
                    min=sum;
                }
                curQue=futQue;
                futQue=new LinkedList<>();
            }
        }
        return min;
    }

    public static void main(String... args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        System.out.print(minlevelsum(root));
    }
}

