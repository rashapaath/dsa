class Solution {
    public int majorityElement(int[] nums) {
        //1)
        int elt=0;
        int count=0;
        //2)
        for(int i=0;i<nums.length;i++){
            if(count==0){
                elt=nums[i];
                count=1;

            }
            else if(nums[i]==elt){
                count++;

            }
            else if(nums[i]!=elt){
                count--;
                
            }
            else{

            }
        }
        return elt;
        
        
    }
        
    
}