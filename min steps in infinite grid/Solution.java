package minstepsininfinitegrid;

import java.util.ArrayList;

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int res=0;
        for(int i=0; i<A.size()-1;i++) {
            res=res+Math.max(Math.abs(A.get(i+1)-A.get(i)),Math.abs(B.get(i+1)-B.get(i)));
        }
        return res;

    }
    public static void main(String ...args) {
        Solution solution=new Solution();
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        A.add(0);
        A.add(1);
        A.add(1);
        B.add(0);
        B.add(1);
        B.add(2);
        System.out.print(solution.coverPoints(A,B));
    }
}

