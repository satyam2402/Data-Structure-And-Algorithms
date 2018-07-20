package palindrome;

public class Solution {
    public int isPalindrome(String A) {
        StringBuffer stringBuffer=new StringBuffer();
        A=A.replaceAll("[^A-Za-z0-9]","");
        stringBuffer.append(A);
        String res=stringBuffer.toString();
        String reverse=stringBuffer.reverse().toString();
        reverse=reverse.toLowerCase();
        res=res.toLowerCase();
        System.out.print(res);
        System.out.print(reverse);
        if(res.equals(reverse)) {
            return 1;
        }
        return 0;
    }

    public static void main(String args[]) {
        Solution solution=new Solution();
        System.out.print(solution.isPalindrome("1a,2"));
    }
}