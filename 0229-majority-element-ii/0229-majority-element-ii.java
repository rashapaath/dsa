import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //moores
        //2)verification
        //nelt=k-1=3-1=2
        int elt1=Integer.MIN_VALUE;
        int elt2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        List<Integer> list=new ArrayList<>();
        int n=nums.length;
        //mmores
        for(int i=0;i<n;i++){
            if(count1==0 && elt2!=nums[i]){
                elt1=nums[i];
                count1=1;
            }
            else if(count2==0 && elt1!=nums[i]){
                elt2=nums[i];
                count2=1;
            }
            else if(nums[i]==elt1){
                count1++;
            }
            else if(nums[i]==elt2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        //verify
        int counts1=0;
        int counts2=0;
        for(int elt:nums){
            if(elt==elt1){counts1++;}
            else if(elt==elt2){counts2++;}
        }
        if(counts1>n/3){
            list.add(elt1);
        }
        if(counts2>n/3){list.add(elt2);}
        return list;


        
    }
}