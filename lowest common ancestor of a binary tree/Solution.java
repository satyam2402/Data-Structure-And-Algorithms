package lowestcommonancestorofabinarytree;

import java.util.ArrayList;
import java.util.Stack;

class Treenode {
    int data;
    Treenode left=null;
    Treenode right=null;
    Treenode(int data) {
        this.data=data;
    }
}
public class Solution {
    public static int count=0;
    public static Treenode lca(Treenode root, int n1, int n2) {
        Stack<Treenode> stack1=new Stack<>();
        ArrayList<Treenode> al1=new ArrayList<>();
        preorder(root,stack1,n1,al1);
        System.out.println("ArrayList 1 starts");
        al1.stream().forEach(i->System.out.print(i.data+" "));
        System.out.println();
        Stack<Treenode> stack2=new Stack<>();
        ArrayList<Treenode> al2=new ArrayList<>();
        preorder(root,stack2,n2,al2);
        System.out.println("ArrayList 2 starts");
        al2.stream().forEach(i->System.out.print(i.data+" "));
        System.out.println();
        for(int i=0;i<al1.size()&& i<al2.size();i++) {
            if(al1.get(i)==al2.get(i)) {
                return al1.get(i);
            }
        }
        return null;
    }

    public static void preorder(Treenode root,  Stack<Treenode> stack, int n, ArrayList<Treenode> al) {
        if(root==null) {
            return;
        }
        stack.push(root);
        if(root.data==n) {
            stack.stream().forEach(i-> al.add(i));
        }
        preorder(root.left,stack,n,al);
        preorder(root.right,stack,n,al);
        stack.pop();
    }

    public static void main(String ...agrs) {
        Treenode root=new Treenode(4);
        root.left=new Treenode(3);
        root.right= new Treenode(5);
        root.left.left= new Treenode(2);
        Treenode treenode=lca(root,3,2);
        if(treenode!=null) {
            System.out.print(treenode.data);
        } else {
            System.out.print("Element does not exist");
        }

    }
}

