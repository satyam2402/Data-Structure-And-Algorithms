package a2b2c2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) throws Exception{
        //code
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int numOfTC=sc.nextInt();
        for(int i=0;i<numOfTC;i++) {
            int num=sc.nextInt();
            String str=br.readLine();
            String strArr[]=str.split(" ");
            int arr[]=new int[num];
            for(int j=0;j<num;j++) {
                arr[j]=Integer.parseInt(strArr[j]);
            }
            Arrays.sort(arr);
            int rth=num-1;
            while(rth>=2) {
                int rthnum=arr[rth];
                int l=0;
                int r=rth-1;
                while(l<r) {
                    if((Math.pow(arr[l],2)+Math.pow(arr[r],2))==Math.pow(rthnum,2)) {
                        System.out.println("Yes");
                        return;
                    } else if((Math.pow(arr[l],2)+Math.pow(arr[r],2))>Math.pow(rthnum,2)) {
                        r=r-1;
                    } else {
                        l=l+1;
                    }
                }
                rth=rth-1;
            }
            System.out.println("No");
        }

    }
}
