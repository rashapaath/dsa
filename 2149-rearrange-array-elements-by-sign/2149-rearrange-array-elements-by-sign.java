import java.util.ArrayList;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] num=new int[n];
        int p=0,neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                num[p]=nums[i];
                p+=2;

            }
            else{
                num[neg]=nums[i];
                neg+=2;

            }
        }  
        return num;   
        
    }
}