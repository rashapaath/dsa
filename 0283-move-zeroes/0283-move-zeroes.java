import java.util.ArrayList;
class Solution {
    //tc=o(2n)
    //sc=o(k)=o(n)
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
                           }
        }
        int i=0;
        for(int elt:list){
            nums[i]=elt;
            i++;
        }
        for(int j=i;j<nums.length;j++){
            nums[j]=0;
        }     
    }
}