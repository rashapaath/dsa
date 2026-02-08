class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //tc=0(n)
        //sc=0(1)
        int count=0;
        int max=count;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=Math.max(count,max);
            }
            else{
                
                count=0;
            }
        }
        return max;   
    }
}