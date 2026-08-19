class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        int[] lps=new int[m];
        int j=0;
        int i=1;
        while(i<m){
            if(needle.charAt(j)==needle.charAt(i)){//match upto j//since j=0 indexed therefore match upto j means j+1 upto j have match upto i
                lps[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    lps[i]=0;//no matching characters
                    i++;
                }
            }
            
        }
        i=0;
        j=0;
        while(i<n){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            if(j==m){
                return i-j;
            }
            else if(i<n && haystack.charAt(i)!=needle.charAt(j)){
                if(j==0){
                    i++;
                }else{
                    j=lps[j-1];
                }

            }
        }
        return -1;
        
    }
}