class Solution {
    public int majorityElement(int[] nums) {
    int n=nums.length;
    int elt=nums[0],count=0;
    for(int i=0;i<n;i++){
        if(count==0){
            elt=nums[i];
            count=1;
        }
        else if(nums[i]==elt){
            count++;
        }
        else{
            count--;
        }

    
    }
    int counta=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==elt){
            counta++;
        }
    }
    if(counta>n/2){
        return elt;
    }
    else{
        return -1;
    }
}
}