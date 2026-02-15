class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arranged=new int[nums.length];
        //1)initialising indices
        int posindex=0;
        int negindex=1;
        //2)iterating array and adding elements to positive and negetive indices
        for(int num:nums){
            if(num>=0){
                arranged[posindex]=num;
                posindex+=2;

            }
            else if(num<0){
                arranged[negindex]=num;
                negindex+=2;

            }
            else{

            }
        }
        return arranged;
        
    }
}