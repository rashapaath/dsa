class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int prefixsum=1,suffixsum=1;    
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            prefixsum*=nums[i];suffixsum*=nums[n-1-i];
            max=Math.max(max,Math.max(prefixsum,suffixsum));

            if(prefixsum==0){prefixsum=1;}
            if(suffixsum==0){suffixsum=1;}
        } 
        return max; 
    }
}