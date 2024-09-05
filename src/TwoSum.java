// LC#1 Blind75#1

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    int[] findIndices(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int i=0;
        while ( i < nums.length ) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
            i+=1;
        }
        return null;
    }


    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.findIndices(new int[]{2, 5, 16, 3, 7, 8, 1}, 11)));
    }
}
