class Solution {
    public int[] findErrorNums(int[] nums) {
       int n=nums.length;
       int[] ans=new int[2];
       int[] ref=new int[n+1];
       for(int i=0;i<=n;i++){
        ref[i]=0;
       }
       for(int i=0;i<n;i++){
        ref[nums[i]]++;
       }
       for(int i=0;i<=n;i++){
        if(ref[i]==0){
            ans[1]=i;
        }
        else if(ref[i]==2){
            ans[0]=i;
        }
       }
       return ans;//repeat 0,missing1


        
    }
}