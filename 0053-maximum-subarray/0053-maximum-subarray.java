class Solution {
    public int maxSubArray(int[] nums) {
        //1)
        int max=Integer.MIN_VALUE;
        int sum=0;
        //2)
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;//since addition of negetiv eindex always decreases the array sum; thefore make it 0 if the sum is <0
            }
        }
        return max;
    }
}