class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = l + 1;
        int maxProfit = 0;
        int n = prices.length;

        while(r < n)
        {
            if(prices[l] <= prices[r])
            maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
            else
            l = r;
            r++;

        }
        return maxProfit;
    }
}
