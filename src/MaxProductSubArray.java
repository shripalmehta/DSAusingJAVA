// LC#152 Blind75#6

import java.lang.*;
import java.util.*;

public class MaxProductSubArray {
    int maxProd(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int min = nums[0], max = nums[0];
        int ans = max;

        // loop starts at 1
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            int temp = Math.max(cur, Math.max(max * cur, min * cur));
            min = Math.max(cur, Math.min(max * cur, min * cur));
            max = temp;

            ans = Math.max(ans, max);
        }

        return ans;
    }

    public static void main(String[] args) {
        MaxProductSubArray maxProductSubArray = new MaxProductSubArray();
        System.out.println(maxProductSubArray.maxProd(new int[]{2, 3, -2, 4}));
    }
}
