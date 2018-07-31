package minsumpathinmatrix;

import java.util.ArrayList;

public class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        int row=A.size();
        int col=A.get(0).size();
        int cost[][]= new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                cost[i][j]= A.get(i).get(j);
            }
        }

        int MCost[][]= new int[row][col];
        MCost[0][0]= cost[0][0];

        //For the base case
        //For row

        for(int i=1; i<col; i++) {
            MCost[0][i]= MCost[0][i-1]+ cost[0][i];
        }

        //For the base case
        //For col
        for(int i=1; i<row; i++) {
            MCost[i][0]= MCost[i-1][0]+ cost[i][0];
        }

        //For the remaining case

        for(int i=1; i<row; i++) {
            for(int j=1;j<col; j++) {
                MCost[i][j]= Math.min(MCost[i-1][j], MCost[i][j-1])+ cost[i][j];
            }
        }
        return MCost[row-1][col-1];
    }

    public static void main(String ...args) {
        ArrayList<Integer> al1= new ArrayList<>();
        al1.add(1);
        al1.add(3);
        al1.add(2);

        ArrayList<Integer> al2= new ArrayList<>();
        al2.add(4);
        al2.add(3);
        al2.add(1);

        ArrayList<Integer> al3= new ArrayList<>();
        al3.add(5);
        al3.add(6);
        al3.add(1);
        ArrayList<ArrayList<Integer>> arrayList= new ArrayList<>();
        arrayList.add(al1);
        arrayList.add(al2);
        arrayList.add(al3);

        System.out.print(new Solution().minPathSum(arrayList));

    }
}
