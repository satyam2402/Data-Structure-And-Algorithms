package leftviewofbinarytree;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode(int data) {
        this.data=data;
    }
}

public class Solution {
    public static void main(String args[]) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.right.left= new TreeNode(5);
        root.right.left.left= new TreeNode(6);

        if(root==null) {
            System.out.print("Queue is empty");
        } else {

            Queue<TreeNode> currQueue=new LinkedList<>();
            currQueue.add(root);
            System.out.print(root.data+" ");
            int sizeOfQue= currQueue.size();
            Queue<TreeNode> futQueue= new LinkedList<>();

            while(sizeOfQue>0) {
                TreeNode treeNode=currQueue.remove();
                if(treeNode.left!=null) {
                    futQueue.add(treeNode.left);
                }
                if(treeNode.right!=null) {
                    futQueue.add(treeNode.right);
                }

                if(currQueue.size()==0 && futQueue.size()>0) {

                    System.out.print(((LinkedList<TreeNode>) futQueue).peek().data+" ");
                    currQueue=futQueue;
                    futQueue= new LinkedList<>();
                }

                sizeOfQue=currQueue.size();
            }
        }
    }
}
