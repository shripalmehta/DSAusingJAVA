// LC#128 Blind75

import java.lang.*;
import java.util.*;

public class LongestConsecutiveSequence {
    public int getLength(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int maxLen = 0;
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int n = i;
                int count = 1;
                while (set.contains(n + 1)) {
                    n += 1;
                    count += 1;
                }
                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        System.out.println(lcs.getLength(new int[]{100, 4, 201, 3, 1, 2}));
        System.out.println(lcs.getLength(new int[]{100, 4, 201, 3, 1, 2, 0}));
    }
}
