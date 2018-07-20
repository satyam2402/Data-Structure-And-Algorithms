package countingnodesintree;


class Treenode {
    int data;
    Treenode left=null;
    Treenode right=null;
    Treenode(int data) {
        this.data=data;
    }
}
public class Solution {

    public static int numofnodes(Treenode root) {
        if(root==null) {
            return 0;
        } else {
            return 1+numofnodes(root.left) + numofnodes(root.right);
        }
    }
    public static void main(String ...agrs) {
        Treenode root=new Treenode(1);
        root.left=new Treenode(2);
        root.right= new Treenode(3);
        root.left.left= new Treenode(4);

        System.out.print("Number of nodes in the tree are:"+numofnodes(root));
    }
}
