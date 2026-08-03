class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;//inintially buy and sell at same day
        int n=prices.length;
        //suming up transactions
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}