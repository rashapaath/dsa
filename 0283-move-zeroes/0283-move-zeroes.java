import java.util.ArrayList;
class Solution {
    
    public void moveZeroes(int[] nums) {
       
            /*brute
        //tc=o(2n)
    //sc=o(k)=o(n)
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
        //better two pointers
        tc=o(2n);
        sc=o(1)
         int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        while(i<nums.length) {
            nums[i]=0;
            i++;
        }
        */
        /*
        optimal
        tc=
        sc=
        */
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}