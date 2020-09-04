 class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int pro=0,min=prices[0];
        for(int i=0;i<prices.length;i++){
            if(min>prices[i])min=prices[i];
            if(prices[i]-min>pro)pro=prices[i]-min;
        }
        return pro;
    }
}
