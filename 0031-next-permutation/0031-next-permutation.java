class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        //1)finding break point
        int dipindex=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                dipindex=i;
                break;
            }
        }
        if(dipindex==-1){
           reverse(0,nums.length-1,nums);
           return;
        }
        //2)finding min elt swap
        for(int i=n-1;i>dipindex;i--){
            if(nums[i]>nums[dipindex]){
                int temp=nums[dipindex];
                nums[dipindex]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        //3)reverse remaining part
        reverse(dipindex+1,nums.length-1,nums);
        
    }
    public void reverse(int ini,int end,int[] nums){
        while(ini<end){
            int temp=nums[ini];
            nums[ini]=nums[end];
            nums[end]=temp;
            ini++;
            end--;
        }
    }
}