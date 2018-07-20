package deletenthnode;

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int size=0;
        ListNode temp=A;
        while(temp!=null) {
            size++;
            temp=temp.next;
        }
        if(size==1) {
            return null;
        }
        if(B>size) {
            A=A.next;
            return A;
        }
        int hold=size-B-1;
        int count=0;
        temp=A;
        while(count<hold) {
            temp=temp.next;
            count++;
        }
        temp.next=temp.next.next;
        return A;
    }
    public static void main(String args[]) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        Solution solution=new Solution();
        solution.removeNthFromEnd(head,1);
    }
}
