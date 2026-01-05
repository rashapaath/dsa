class Solution {
    public int missingNumber(int[] nums) {
        int l=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l){
                l=nums[i];
            }
        }
        for(int i=0;i<=l;i++){
            int flag=0;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return l + 1;
       
    }
}