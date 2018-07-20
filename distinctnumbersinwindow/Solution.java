package distinctnumbersinwindow;

import java.util.*;

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> all=new ArrayList<>();
        if(B>A.size()) {
            return new ArrayList<Integer>();
        } else {
            int limit=A.size()-B+1;
            for(int k=0;k<limit;k++) {
                ArrayList<Integer> al= new ArrayList<Integer>();
                int count=0;
                for(int j=k;j<B+k;j++) {
                    if(!al.contains(A.get(j))){
                        count++;
                        al.add(A.get(j));
                    }
                }
                all.add(count);
            }
            //System.out.println(all);
            return all;
        }
    }

    public static void main(String ...args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(7);
        al.add(7);
        al.add(81);
        al.add(81);

        Solution solution=new Solution();
        System.out.println(solution.dNums(al,1));
    }
}
