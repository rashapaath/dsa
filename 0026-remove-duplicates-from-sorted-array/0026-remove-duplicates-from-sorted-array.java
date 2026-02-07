import java.util.TreeSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k=set.size();
        int i=0;
        for(int elt:set){
            nums[i++]=elt;
        }
        return  k;

        
    }
}