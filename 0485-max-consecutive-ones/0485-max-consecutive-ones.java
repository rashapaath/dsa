import java.util.ArrayList;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        ArrayList<Integer> countlist=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]!=1){
                countlist.add(count);
                count=0;
            }
        }
        countlist.add(count);
        int countmax=countlist.get(0);
        for(int i=0;i<countlist.size();i++){
            if(countmax<countlist.get(i)){
                countmax=countlist.get(i);
            }
        }
        return countmax;
        
    }
}