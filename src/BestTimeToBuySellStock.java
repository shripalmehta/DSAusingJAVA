// LC#121 Blind75#2

public class BestTimeToBuySellStock {
    int maxProfit(int[] prices) {
        int profit = 0, maxProfit = 0;
        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            profit = prices[i] - min;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        BestTimeToBuySellStock BTTBSS = new BestTimeToBuySellStock();
        int profit = BTTBSS.maxProfit(new int[]{10, 1, 5, 3, 6, 4});
        System.out.println(profit);
    }
}
