package rotatinglinkedlistbyk;


class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Solution {
    public static ListNode rotateRight(ListNode A, int B) {
        int count=0;
        ListNode temp=A;
        ListNode prev=null;
        while(temp!=null) {
            count++;
            prev=temp;
            temp=temp.next;
        }
        if(B>count) {
            B=B%count;
        }
        if(B==0 || B==count) {
            return A;
        }
        int travtill= count-B;
        temp=A;
        while(travtill>1) {
            temp=temp.next;
            travtill--;
        }
        prev.next=A;
        A=temp.next;
        temp.next=null;
        return A;
    }
    public static void main(String args[]) {
        ListNode head=new ListNode(1);
        head.next= new ListNode(2);
        head.next.next= new ListNode(3);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next= new ListNode(5);
        head= rotateRight(head, 2);
        ListNode temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }

    }
}

