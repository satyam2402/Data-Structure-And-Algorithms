package poweroftwo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int power(String A) {
        BigInteger bi=new BigInteger(A);
        ArrayList<Integer> al=new ArrayList<>();
        while(bi.compareTo(BigInteger.ZERO)>0) {
            al.add(0,bi.mod(new BigInteger("2")).intValue());
            bi=bi.divide(new BigInteger("2"));
        }

        if(Collections.frequency(al,1)==1 && Collections.frequency(al,0)==al.size()-1 && Collections.frequency(al,0)>0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String ...agrs) {
        Solution solution=new Solution();
        System.out.println(solution.power("1"));
    }
}
