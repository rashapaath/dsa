import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        int maj=nums[0];
        for(int i=0;i<nums.length;i++){
            int count=map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],count);
            if(count>max){
                max=count;
                maj=nums[i];
            }
        }
        return maj;
        
        
    }
}