class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int profit=0;//inintially let buy and sell on same day therefore the profit=0;
        //keep incrementing the selldayy 
        //updating profit if current profit is maximum
        //updating buy if current sellprice less than current buy price
        //keep incrementing sellday
        for(int sellday=1;sellday<prices.length;sellday++){
            int sellprice=prices[sellday];
            profit=Math.max(profit,sellprice-buyprice);
            buyprice=Math.min(buyprice,sellprice);

        }
        return profit;
        
    }
}