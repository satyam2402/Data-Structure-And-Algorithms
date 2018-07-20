package verticalordertraversal;

import java.util.*;

class TreeNode{
    TreeNode(int val) {
        this.val=val;
    }
    int val;
    TreeNode left;
    TreeNode right;
}

public class Solution {
    public static TreeMap<Integer,List<Integer>> hashMap=new TreeMap<>();
    public void preorder(TreeNode node, int k) {
        if(node==null) {
            return;
        }
        if(hashMap.containsKey(k)) {
            hashMap.get(k).add(node.val);
        } else {
            List<Integer> list=new ArrayList<>();
            list.add(node.val);
            hashMap.put(k,list);
        }
        preorder(node.left,k-1);
        preorder(node.right, k+1);
    }
    public static void main(String ...args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.left.left=new TreeNode(6);
        Solution solution=new Solution();
        solution.preorder(root,0);

        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        System.out.println("Now printing the vertical order of the tree");
        for(Map.Entry entry:hashMap.entrySet()) {
            al.add((ArrayList<Integer>) entry.getValue());
        }

        System.out.println(al);


    }
}
