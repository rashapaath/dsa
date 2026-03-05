import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] index=new int[2];
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }
            else{
                index[0]=i;
                index[1]=map.get(target-nums[i]);
            }
       }
       return index;
    }
}