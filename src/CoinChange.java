// LC#322

import java.lang.*;
import java.util.*;

public class CoinChange {
    int fewestCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount+1);

        dp[0] = 0;
        for (int i=1; i<amount+1; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }

        if (dp[amount] == amount+1) {
            return -1;
        } else {
            return dp[amount];
        }
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        System.out.println(coinChange.fewestCoins(new int[]{1, 3, 4, 5}, 7));
        System.out.println(coinChange.fewestCoins(new int[]{11, 13, 14, 15}, 15));
    }
}
