// LC#11 Blind75#10

import java.util.*;
import java.lang.*;

public class ContainerWithMostWater {
    int mostWater(int[] heights) {
        int l = 0, r = heights.length - 1;
        int water = 0;

        while (l < r) {
            water = Math.max(water, Math.min(heights[l], heights[r]) * (r - l));
            if (heights[l] <= heights[r]) {
                l += 1;
            } else {
                r -= 1;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        ContainerWithMostWater container = new ContainerWithMostWater();
        int water = container.mostWater(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        System.out.println(water);
    }
}
