class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
        
    }
    public int bs(int[] nums,int ini,int end,int target){
        if(ini>end){return -1;}
        int mid=ini+(end-ini)/2;
        if(target==nums[mid]){
            return mid;
        }
        else if(target>nums[mid]){
            return bs(nums,mid+1,end,target);

        }
        else{
            return bs(nums,ini,mid-1,target);

        }
       

    }
}