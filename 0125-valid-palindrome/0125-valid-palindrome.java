class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return pallicheck(0,s.length()-1,s);
    }
    public boolean pallicheck(int i,int n,String s){
        //base
        if(i>=n){//even(i>n)//odd(i=n)
            return true;
        }
        if(s.charAt(i)!=s.charAt(n)){
            return false;
        }
        return pallicheck(i+1,n-1,s);
    }
}