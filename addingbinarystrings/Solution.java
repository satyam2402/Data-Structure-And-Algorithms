package addingbinarystrings;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String addBinary(String A, String B) {
        List<Integer> lA = new ArrayList<>();
        List<Integer> lB = new ArrayList<>();
        int carry = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            lA.add(Integer.parseInt(Character.toString(A.charAt(i))));
        }
        for (int i = B.length() - 1; i >= 0; i--) {
            lB.add(Integer.parseInt(Character.toString(B.charAt(i))));
        }
        String res = "";
        if (lA.size() == lB.size()) {
            for (int i = 0; i < lA.size() ; i++) {
                int sum = lA.get(i) + lB.get(i) + carry;
                if (sum == 0 || sum == 1) {
                    res = Integer.toString(sum) + res;
                    carry = 0;
                } else if (sum == 2 || sum == 3) {
                    res = Integer.toString(sum - 2) + res;
                    carry = 1;
                }
            }
            if(carry==1) {
                res=Integer.toString(carry)+res;
            }
        } else if(lA.size() > lB.size()) {
            for (int i = 0; i < lB.size() ; i++) {
                int sum = lA.get(i) + lB.get(i) + carry;
                if (sum == 0 || sum == 1) {
                    res = Integer.toString(sum) + res;
                    carry = 0;
                } else if (sum == 2 || sum == 3) {
                    res = Integer.toString(sum - 2) + res;
                    carry = 1;
                }
            }
            for (int i = lB.size(); i < lA.size() ; i++) {
                int sum = lA.get(i)  + carry;
                if (sum == 0 || sum == 1) {
                    res = Integer.toString(sum) + res;
                    carry = 0;
                } else if (sum == 2 || sum == 3) {
                    res = Integer.toString(sum - 2) + res;
                    carry = 1;
                }
            }
            if(carry==1) {
                res=Integer.toString(carry)+res;
            }
        } else {
            for (int i = 0; i < lA.size() ; i++) {
                int sum = lA.get(i) + lB.get(i) + carry;
                if (sum == 0 || sum == 1) {
                    res = Integer.toString(sum) + res;
                    carry = 0;
                } else if (sum == 2 || sum == 3) {
                    res = Integer.toString(sum - 2) + res;
                    carry = 1;
                }
            }
            for (int i = lA.size(); i < lB.size() ; i++) {
                int sum = lB.get(i)  + carry;
                if (sum == 0 || sum == 1) {
                    res = Integer.toString(sum) + res;
                    carry = 0;
                } else if (sum == 2 || sum == 3) {
                    res = Integer.toString(sum - 2) + res;
                    carry = 1;
                }
            }
            if(carry==1) {
                res=Integer.toString(carry)+res;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        System.out.println(addBinary("11","1"));
    }
}
