309. Best Time to Buy and Sell Stock with Cooldown

  // Beats 100%

class Solution {
    public int maxProfit(int[] A) {
        int buyNow =0, sellNow =0;
        int buyNext =0, sellNext =0;
        int coolDown =0, n =A.length;
    
        for(int i=n-1; i>=0; i--){ 
            sellNow = Math.max(A[i] + coolDown, sellNext);
            buyNow = Math.max(sellNext - A[i], buyNext);
             
            coolDown = buyNext; buyNext = buyNow; sellNext = sellNow; 
         }
        
         return buyNow;
    }
}

// Beats 13.5%

/* class Solution {
    private int maxProfit(int i, int buyOrSell, int[] prices, HashMap<String, Integer> hm) {
        if (i >= prices.length) 
            return 0;

        String key = i + "codebix" + buyOrSell;
        if(hm.containsKey(key))
            return hm.get(key);
        int x = 0; 
        if (buyOrSell == 0) {
            int buy   =  maxProfit(i + 1, 1, prices, hm) - prices[i];
            int noBuy =  maxProfit(i + 1, 0, prices, hm);  // 0 for buy & 1 for sell 
            x = Math.max(buy, noBuy);
         } else {
            int sell   = maxProfit(i + 2, 0, prices, hm) + prices[i];
            int noSell = maxProfit(i + 1, 1, prices, hm);
            x = Math.max(sell, noSell);
        }
        hm.put(key, x);
        return x;
    }
    
    public int maxProfit(int[] prices) {
        HashMap<String, Integer> hm = new HashMap<>();
        return maxProfit(0, 0, prices, hm);
    }
} */

