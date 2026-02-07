class Solution {
    public boolean check(int[] nums) { 
        //condition for sort
        //arr[i]<=arr[i+1](0 to n-2)this will not break 
        //since rotation allowed therefore one break at any point occurs
        //also one  more condition 
        //arr[n-1]<=arr[0]
        //inorder to make considering this condition too therefor to check whether the rotated(or not) array is sorted or not
        //1)arr[i]<=arr[i+1%n] 
        //if no break sorted unrotated array
        //if one break sorted rotaated array
        //if more than one break unsorted array
        boolean check=true;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                check=false;
                count++;
            }

        }
        if(check==true){
            return true;
        }
        else if(count==1){
            return true;
        }
        else{
            return false;
        }
        
    }
}