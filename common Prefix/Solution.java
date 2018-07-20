package commonPrefix;

import java.util.ArrayList;

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        int len=A.get(0).length();
        String min=A.get(0);
        for(String i:A) {
            if(i.length()<len) {
                len=i.length();
                min=i;
            }
        }
        boolean res=true;
        if(len>0) {
            for(int i=len;i>=0;i--) {
                for(String str:A) {
                    res=res&&(str.substring(0,i).equals(min.substring(0,i)));
                }
                if(res==true) {
                    return min.substring(0,i);
                } else {
                    res=true;
                }
            }

        }
        return "";
    }
    public static void main(String args[]) {
        Solution solution=new Solution();
        ArrayList<String> al =new ArrayList<>();
        al.add("abcd");
        al.add("abcd");
        al.add("efgh");
        System.out.println(solution.longestCommonPrefix(al));
    }
}

