class Solution {
    public void rotate(int[] nums, int k) {
   //1)update k
   int n=nums.length;
   k=k%n;
   //2)rotation
   reverse(nums,0,n-1);
   reverse(nums,0,k-1);
   reverse(nums,k,n-1);
   
    }
    public void reverse(int[] nums,int init,int end){
        while(init<end){
            int temp=nums[init];
            nums[init]=nums[end];
            nums[end]=temp;
            init++;
            end--;

        }
    }
}