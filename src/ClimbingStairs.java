// LC#70 Blind75#11

import java.lang.*;
import java.util.*;

public class ClimbingStairs {
    int distinctWays(int stairCount) {
        int[] dp = new int[stairCount+1];
        dp[stairCount] = 1;
        dp[stairCount-1] = 1;

        int i=stairCount-2;
        while (i>=0) {
            dp[i] = dp[i+1] + dp[i+2];
            i-=1;
        }

        return dp[0];
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int ways = climbingStairs.distinctWays(5);
        System.out.println(ways);
    }
}
