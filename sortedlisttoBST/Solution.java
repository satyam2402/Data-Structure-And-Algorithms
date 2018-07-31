package sortedlisttoBST;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
 class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}


public class Solution {
    public TreeNode sortedListToBST(ListNode a) {
        if(a==null) {
            return null;
        }
        ArrayList<Integer> al= new ArrayList<>();
        ListNode temp=a;
        int count=0;
        while(temp!=null) {
            al.add(temp.val);
            temp=temp.next;
            count++;
        }
        int low=0;
        int high= count-1;

        TreeNode treeNode=getBST(al, low, high);
        return treeNode;
    }

    public static TreeNode getBST(ArrayList<Integer> al, int low, int high) {
        if(low>high) {
            return null;
        }
        int mid=(low+high)/2;
        TreeNode root= new TreeNode(al.get(mid));
        root.left= getBST(al, low, mid-1);
        root.right= getBST(al, mid+1, high);
        return root;
    }
}
