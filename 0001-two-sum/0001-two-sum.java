class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int found=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    found=1;
                    result[0]=i;
                    result[1]=j;
                    break;
                }

            }
            if(found==1){
                break;
            }
        }
        return result;
    }
    //tc=o(n*n)
    //sc=o(1)
}