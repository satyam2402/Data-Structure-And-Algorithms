package bottomviewofabinarytree;

import java.util.*;

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
    private static HashMap<Integer, Queue<Integer>> bottomView(TreeNode treeNode, int hd) {
        if(treeNode==null) {
            return null;
        }
        Queue<TreeNodeWithHD> currQue= new LinkedList<>();
        HashMap<Integer, Queue<Integer>> hashMap= new HashMap<>();

        currQue.add(new TreeNodeWithHD(treeNode,0));
        while(currQue.size()>0) {
            TreeNodeWithHD treeNodeWithHD=currQue.remove();
            int ihd=treeNodeWithHD.hd;
            if(hashMap.containsKey(ihd)) {
                hashMap.get(ihd).add(treeNodeWithHD.treeNode.val);
            } else {
                Queue<Integer> queue=new LinkedList<>();
                queue.add(treeNodeWithHD.treeNode.val);
                hashMap.put(ihd, queue);
            }
            if(treeNodeWithHD.treeNode.left!=null) {
                currQue.add(new TreeNodeWithHD(treeNodeWithHD.treeNode.left, ihd-1));
            }
            if(treeNodeWithHD.treeNode.right!=null) {
                currQue.add(new TreeNodeWithHD(treeNodeWithHD.treeNode.right, ihd+1));
            }

        }
        return hashMap;
    }
    public static void main(String ...args) {

        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        bottomView(root,0).forEach((k,v)-> {
            Iterator<Integer> integerIterator=v.iterator();
            int lastelem=0;
            while(integerIterator.hasNext()) {
                lastelem=integerIterator.next();
            }
            System.out.print(k+":"+lastelem+" ");
        });



    }
}
