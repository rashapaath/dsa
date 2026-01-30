class Solution {
    public int reverse(int x) {
    int rev=0;
    while(x!=0){
        //1)
        int dig=x%10;
        //2)
        //checking overflow condition
        //greater than  ound numbers
        if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE&&dig>7)){
            return 0;

        }
        //exact bound numbers
        if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE&&dig<-8)){
            return 0;
        }
        rev=(rev*10)+dig;
        //3)
        x=x/10;
    }
    return rev;
    }
}