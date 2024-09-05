// LC#217 Blind75#3

import java.lang.*;
import java.util.*;

public class ContainsDuplicate {
    boolean hasDupes(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.hasDupes(new int[]{1, 2, 3, 2}));
    }
}
