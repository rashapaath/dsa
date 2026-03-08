class Solution {
    public int maxProfit(int[] prices) {
        //using dp
        //as we only moving forward that is not considering previous day cost 
        int minprice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int diff=prices[i]-minprice;
            profit=Math.max(profit,diff);
            minprice=Math.min(minprice,prices[i]);
        }
        return profit;
    }
}