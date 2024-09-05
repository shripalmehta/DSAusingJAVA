// LC#15 Blind75#9

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i=0; i<nums.length && nums[i]<=0; i++) {
            if (i==0 || nums[i]!=nums[i-1]) {
                twoSum2(nums, i, ans);
            }
        }
        return ans;
    }

    void twoSum2(int[] nums, int i, List<List<Integer>> ans) {
        int l=i+1, r=nums.length-1;
        while(l<r) {
            int sum = nums[l]+nums[r]+nums[i];

            if (sum > 0) {
                r-=1;
            } else if (sum < 0) {
                l+=1;
            } else { // sum == 0
//                System.out.println(Arrays.asList(nums[i], nums[l], nums[r]));
                ans.add(Arrays.asList(nums[i], nums[l], nums[r]));

                r-=1;
                l+=1;
                while (l<r && nums[l] == nums[l-1]) {
                    l+=1;
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, 4});
        System.out.println(result);
    }
}
