import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,elt1=Integer.MIN_VALUE;
        int cnt2=0,elt2=Integer.MIN_VALUE;
        int n=nums.length;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(cnt1==0 && (nums[i]!=elt2)){
                cnt1=1;
                elt1=nums[i];
            }
            else if(cnt2==0 && (nums[i]!=elt1)){
                cnt2=1;
                elt2=nums[i];
            }
            else if(nums[i]==elt1){
                cnt1++;
            }else if(nums[i]==elt2){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        int accnt1=0;
        int accnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==elt1){
                accnt1++;
            }else if(nums[i]==elt2){
                accnt2++;
            }
        }
        if(accnt1>n/3){l.add(elt1);}
        if(accnt2>n/3 && (elt1!=elt2)){l.add(elt2);}
        return l;
        
    }
}