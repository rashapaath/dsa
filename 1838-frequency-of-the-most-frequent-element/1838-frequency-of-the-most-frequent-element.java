import java.util.Arrays;
class Solution {
    public int maxFrequency(int[] nums, int k) {
       //sorting
       Arrays.sort(nums);
       //sliding window
       int l=0,r=0;
       int res=0;
       long total=0;
       //res=maxwindowsize possible which satisfy following condition
       /*nums[r]*wl<=total+k;
       if exceeds then reduce windowlength
       i
       */
       while(r<nums.length){
        total+=nums[r];
        while((long)nums[r]*(r-l+1)>total+k){
            total-=nums[l];
            l++;
        }
        res=Math.max(res,r-l+1);
        r++;
       }
       return res;


        }
        
    }