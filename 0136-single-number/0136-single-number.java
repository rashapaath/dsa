class Solution {
    public int singleNumber(int[] nums) {
        /*
        int elt=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                
                }
                if(count>1){
                    break;
                }
            }
            if(count==1){
                elt=nums[i];
            }
        }
        return elt;
        */
        int ones=0;
        for(int elt:nums){
        ones^=elt;
        }
        return ones;

    }
}