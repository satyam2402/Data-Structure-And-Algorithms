package noofwaystoreachendifsomecellsareblocked;

import java.util.ArrayList;

public class Solution {
    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        int row=A.size();
        int col=A.get(0).size();
        if(A.get(0).get(0)==1) {
            return 0;
        }
        int pm[][]= new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                pm[i][j]=0;
            }
        }

        //For row base
        for(int i=0;i<col;i++) {
            if(A.get(0).get(i)==1) {
                break;
            } else {
                pm[0][i]=1;
            }
        }

        //For base column
        for(int i=0;i<row;i++) {
            if(A.get(i).get(0)==1) {
                break;
            } else {
                pm[i][0]=1;
            }
        }

        //For recurrence state
        for(int i=1;i<row; i++) {
            for(int j=1;j<col;j++) {
                if(A.get(i).get(j)==0) {
                    pm[i][j]=pm[i-1][j]+pm[i][j-1];
                }
            }
        }
        return pm[row-1][col-1];

    }
    public static void main(String args[]) {
        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2= new ArrayList<>();
        ArrayList<Integer> al3= new ArrayList<>();
        al1.add(0);
        al1.add(0);
        al1.add(0);

        al2.add(0);
        al2.add(1);
        al2.add(0);

        al3.add(0);
        al3.add(0);
        al3.add(0);

        ArrayList<ArrayList<Integer>> arrayList= new ArrayList<>();
        arrayList.add(al1);
        arrayList.add(al2);
        arrayList.add(al3);

        System.out.print(new Solution().uniquePathsWithObstacles(arrayList));
    }
}
