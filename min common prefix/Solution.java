package mincommonprefix;

import java.util.ArrayList;

public class Solution {
    public static String longestCommonPrefix(ArrayList<String> A) {
        int min=Integer.MAX_VALUE;
        String minString=null;
        for(String i:A) {
            if(i.length()<=min) {
                min=i.length();
                minString=i;
            }
        }
        String anss="";
        while (min>=0) {
            boolean ans=true;
            for(int i=0;i<A.size();i++) {
                ans=ans && minString.substring(0,min).equals(A.get(i).substring(0,min));
                if(!ans) {
                    break;
                }
            }
            if(ans) {
                anss=minString.substring(0,min);
                break;
            }
            min=min-1;
        }
        return anss;

    }

    public static void main(String args[]) {
        ArrayList<String> al=new ArrayList<>();
        al.add("abcd");
        al.add("abc");
        al.add("ab");
        System.out.println(longestCommonPrefix(al));
    }
}