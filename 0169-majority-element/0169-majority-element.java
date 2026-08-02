class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int elt=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                elt=nums[i];

            }else if(nums[i]==elt){
                count++;

            }else{
                count--;
            }
        }
        int acnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==elt){
                acnt++;
            }
        }
        return elt;
        
    }
}