package topviewofabinarytree;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left=null;
    TreeNode right=null;
}

class TreeNodeWithHD {
    TreeNode treeNode;
    int hd;
    TreeNodeWithHD(TreeNode treeNode, int hd) {
        this.treeNode=treeNode;
        this.hd=hd;
    }
}

public class Solution {
    private static void topView(TreeNode treeNode, int hd) {
        if(treeNode==null) {
            return;
        }
        Queue<TreeNodeWithHD> currQue= new LinkedList<>();
        HashSet<Integer> hashSet= new HashSet<>();

        currQue.add(new TreeNodeWithHD(treeNode,0));
        while(currQue.size()>0) {
            TreeNodeWithHD treeNodeWithHD=currQue.remove();
            int ihd=treeNodeWithHD.hd;
            if(!hashSet.contains(ihd)) {
                System.out.print(ihd+":"+treeNodeWithHD.treeNode.val+" ");
                hashSet.add(ihd);
            }
            if(treeNodeWithHD.treeNode.left!=null) {
                currQue.add(new TreeNodeWithHD(treeNodeWithHD.treeNode.left, ihd-1));
            }
            if(treeNodeWithHD.treeNode.right!=null) {
                currQue.add(new TreeNodeWithHD(treeNodeWithHD.treeNode.right, ihd+1));
            }

        }
    }
    public static void main(String ...args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.right.right = new TreeNode(5);
        root.left.right.right.right = new TreeNode(6);
        topView(root,0);

    }
}