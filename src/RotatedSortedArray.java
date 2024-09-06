// LC#153 Blind75#7

public class RotatedSortedArray {
    int findMinimumElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int lo=0, hi=nums.length-1;
        int mid=0;
        int ans=nums[0];

        // Binary Search
        while (lo <= hi) {
            if (nums[lo] < nums[hi]) {
                ans = Math.min(ans, nums[lo]);
            }
            mid = (lo + hi) / 2;
            ans = Math.min(ans, nums[mid]);
            if (nums[mid] >= nums[lo]) { // && nums[mid] > nums[hi]
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        RotatedSortedArray rotatedSortedArray = new RotatedSortedArray();
        System.out.println(rotatedSortedArray.findMinimumElement(new int[]{11,12,13,15}));
    }
}
