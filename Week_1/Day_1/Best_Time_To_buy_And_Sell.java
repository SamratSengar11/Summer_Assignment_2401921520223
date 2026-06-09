class Solution {
    public int maxProfit(int[] prices) {
        int Maxpro=0;
        int BestBuy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>BestBuy){
                Maxpro=Math.max(Maxpro,prices[i]-BestBuy);
            }
            BestBuy=Math.min(BestBuy,prices[i]);
        }

         
         

        
        
        
     return Maxpro;}
}
            
