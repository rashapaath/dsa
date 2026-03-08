import java.util.ArrayList;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> poseven=new ArrayList<>();
        ArrayList<Integer> negodd=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            if(nums[i]>=0){
                poseven.add(nums[i]);
            }
            else{
                negodd.add(nums[i]);
            }
        }
        int k=0;
        int l=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=poseven.get(k++);
            }
            else{
                nums[i]=negodd.get(l++);
            }
        }
        return nums;

        
        
    }
}