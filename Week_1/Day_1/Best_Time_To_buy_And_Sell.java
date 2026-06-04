class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int i=0;
        int buy=prices[i];
         int indx1=-1;
         int indx2=-1;
         int maxprofit = 0;
        for(i=0;i<n;i++){
            if(prices[i]<=buy) {
                buy=prices[i];
                indx1 =i;
            }
            
