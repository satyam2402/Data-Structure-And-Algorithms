package interviewbit.reversinganumber;

public class Solution {
    public static int reverse(int A) {
        boolean neg=false;
        if(A<0) {
            neg=true;
            A=A*-1;
        }
        long b=A;
        long rA=0;
        long r=0;

        while(b>0) {
            r=b%10;
            rA=rA*10+r;
            b=b/10;
        }
        System.out.print(rA);
        if(neg) {
            rA=rA*-1;
            if(rA<-2147483648) {
                return 0;
            } else {
                return (int)rA;
            }
        } else {
            if(rA>2147483647) {
                return 0;
            } else {
                return (int)rA;
            }
        }
    }
    public static void main(String ...args) {
        System.out.print("     "+reverse(-1146467285));
    }
}
