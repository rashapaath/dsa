class Solution {
    public String addBinary(String a, String b) {
        //1)trim
        a=trim(a);
        b=trim(b);
        //2)initiate pointers
        int i=a.length()-1;
        int j=b.length()-1;
        //3)add elts and put into string builder  
        StringBuilder ans=new StringBuilder();
        int carry=0; 
        while(i>=0||j>=0||carry!=0){
            int s1d=(i>=0)?a.charAt(i)-'0':0;
            int s2d=(j>=0)?b.charAt(j)-'0':0;
            int sum=s1d+s2d+carry;
            ans.append(sum%2);
            carry=sum/2;
            i--;
            j--;
                   }    
        //4)return reverse result
        return ans.reverse().toString();
    }
    static String trim(String s){
        int index=s.indexOf('1');
        if(index!=-1){
            return s.substring(index);
        }
        return "0";

    }
}