package klargestelements;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        //code
        int numOTCases=sc.nextInt();
        //iterating test cases
        for(int i=0;i<numOTCases;i++) {
            int input[]= new int[2];
            String inputInstring=bufferedReader.readLine();
            String strInput[]= inputInstring.split(" ");
            for(int j=0;j<2;j++) {
                input[j]=Integer.parseInt(strInput[j]);
            }
            int arr[]=new int[input[0]];
            String arrayInstring=bufferedReader.readLine();
            String strarr[]= arrayInstring.split(" ");
            for(int j=0;j<input[0];j++) {
                arr[j]=Integer.parseInt(strarr[j]);
            }

            // Bubble sorting
            for(int j=0;j<=input[1]-1;j++) {
                for(int k=0;k<=input[0]-2-j;k++) {
                    if(arr[k]>arr[k+1]) {
                        int temp=arr[k];
                        arr[k]= arr[k+1];
                        arr[k+1]= temp;
                    }
                }
            }
            //Iterating from, from to to
            int to=input[0]-1;
            int from=to-input[1]+1;
            for(int j=to;j>=from;j--) {
                System.out.print(arr[j]);
                if(j!=from) {
                    System.out.print(" ");
                }
            }


        }
    }
}
