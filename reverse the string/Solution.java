package reversethestring;

public class Solution {
    public String reverseWords(String a) {
        String stringArray[]=a.split(" ");
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=stringArray.length-1;i>=0; i--) {
            stringArray[i]=stringArray[i].replace(" ","");
            if(!stringArray[i].equals("")){
                stringBuffer.append(stringArray[i]);
                if(i!=0) {
                    stringBuffer.append(" ");
                }
            }

        }
        return stringBuffer.toString();
    }
    public static void main(String args[]) {
        Solution solution=new Solution();
        System.out.print(solution.reverseWords(" welcome    to india"));

    }
}
