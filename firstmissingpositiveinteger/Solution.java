package firstmissingpositiveinteger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        if(Collections.max(A)<=0) {
            return 1;
        } else {
            for(int i = 0; i<Collections.max(A); i++) {
                if(!A.contains(i)) {
                    return i;
                }
            }
        }
        return Collections.max(A)+1;
    }
}
