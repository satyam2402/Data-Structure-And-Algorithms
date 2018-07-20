package reversedigitsofainteger;



public class Solution {
    public int reverse(int A) {
        long b=A;
        long mul=1;
        if(b<0) {
            mul=-1;
            b=b*-1;
        }

        long num=0;
        while(b>0) {
            num=num*10+b%10;
            b=b/10;
        }
        if(num*mul<-2147483648 || num*mul>2147483647) {
            return 0;
        }
        return (int)(num*mul);
    }
    public static void main(String ...args) {
        Solution solution=new Solution();
        System.out.println(solution.reverse(-1146467285));
    }
}
