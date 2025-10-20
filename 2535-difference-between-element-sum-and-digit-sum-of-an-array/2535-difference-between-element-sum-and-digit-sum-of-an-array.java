class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digsum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int dig;
            int n=nums[i];
            while(n!=0){
                dig=n%10;
                digsum=digsum+dig;
                n=n/10;
            }
        }
        return sum-digsum;

    }
}