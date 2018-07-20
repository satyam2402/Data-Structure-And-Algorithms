package duplicateinthearray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static int repeatedNumber(final List<Integer> a) {
        HashMap<Integer, Boolean> hashmap=new HashMap<>();
        for(int i:a) {
            if(hashmap.get(i)!=null && hashmap.get(i)==true) {
                return i;
            } else {
                hashmap.put(i, true);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(1);
        al.add(4);
        System.out.println(repeatedNumber(al));
    }
}
