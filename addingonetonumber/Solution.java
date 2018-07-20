package addingonetonumber;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        for(int i=0; i<A.size();i++) {
            if(A.get(i)!=0) {
                A=new ArrayList<Integer>(A.subList(i,A.size()));
                break;
            }
        }
        ArrayList<Integer> newAl=new ArrayList<Integer>();
        int carry=0;
        int ele=0;

        for(int i=A.size()-1;i>=0;i--) {
            if(i==A.size()-1) {
                ele=A.get(i)+1+carry;
            } else {
                ele=A.get(i)+carry;
            }
            if(ele<=9) {
                newAl.add(0,ele);
                carry=0;
            } else {
                ele=ele%10;
                newAl.add(0,ele);
                carry=1;
            }

        }
        if(carry==1) {
            newAl.add(0,carry);
        }
        return newAl;
    }
    public static void main(String ...args) {
        Solution solution=new Solution();
        ArrayList<Integer> al=new ArrayList<>();
        al.add(9);
        al.add(9);
        al.add(9);
        al.add(9);
        System.out.print(solution.plusOne(al));
    }
}

