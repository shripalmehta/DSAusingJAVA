// LC#53 Blind75#5

public class MaxSumSubArray {
    int maxSum(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumSubArray mss = new MaxSumSubArray();
        System.out.println(mss.maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, -4}));
    }
}
