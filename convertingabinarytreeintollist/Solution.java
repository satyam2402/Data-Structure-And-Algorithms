package convertingabinarytreeintollist;

class Treenode {
    int data;
    Treenode left=null;
    Treenode right=null;
    Treenode(int data) {
        this.data=data;
    }
}
public class Solution {
    public static Treenode prev=null;
    public static Treenode head=null;
    public static void treetolinkedlist(Treenode root) {
        if(root==null) {
            return;
        }
        treetolinkedlist(root.left);
        if(prev==null) {
            head= root;
        } else {
            root.left= prev;
            prev.right= root;
        }
        prev=root;
        treetolinkedlist(root.right);
    }

    public static void printLinkedList(Treenode head) {
        while(head!=null) {
            System.out.print(head.data+" ");
            head=head.right;
        }
    }
    public static void main(String ...agrs) {
        Treenode root=new Treenode(1);
        root.left=new Treenode(2);
        root.right= new Treenode(3);
        root.left.left= new Treenode(4);

        treetolinkedlist(root);
        printLinkedList(head);

    }
}
