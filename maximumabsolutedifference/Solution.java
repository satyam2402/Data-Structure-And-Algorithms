package maximumabsolutedifference;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        ArrayList<Integer> maxArrayList=new ArrayList<>();
        ArrayList<Integer> minArrayList=new ArrayList<>();
        for(int i=0;i<A.size();i++) {
            maxArrayList.add(A.get(i)+i);
        }
        for(int i=0;i<A.size();i++) {
            minArrayList.add(A.get(i)-i);
        }
        return Math.max((Collections.max(maxArrayList)-Collections.min(maxArrayList)),Collections.max(minArrayList)-Collections.min(minArrayList));
    }
}
