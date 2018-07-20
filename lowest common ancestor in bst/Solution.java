package lowestcommonancestorinbst;

class Treenode {
    int data;
    Treenode left=null;
    Treenode right=null;
    Treenode(int data) {
        this.data=data;
    }
}
public class Solution {

    public static Treenode lca(Treenode node, int n1, int n2)
    {   if(node==null) {
        return null;
    }
        if(node.data>n1 && node.data>n2) {
            return lca(node.left, n1,n2);
        }
        if(node.data<n1 && node.data<n2) {
            return lca(node.right,n1,n2);
        }
        return node;
    }

    public static void main(String ...agrs) {
        Treenode root=new Treenode(4);
        root.left=new Treenode(3);
        root.right= new Treenode(5);
        root.left.left= new Treenode(2);
        System.out.print(lca(root,3,5).data);

    }
}
