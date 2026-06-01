class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0; int minprice = prices[0]; int currprofit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<minprice){
                minprice = prices[i];
                continue;
            }
            currprofit = prices[i] - minprice;
            if(currprofit>maxprofit){
                maxprofit = currprofit;
            }
        }
        return maxprofit;
    }
}