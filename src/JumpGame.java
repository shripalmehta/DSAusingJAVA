// LC#55 Blind75

import java.util.Arrays;

public class JumpGame {

////    TC = O(n^2)
//    boolean canJump(int[] nums) {
//        boolean[] dp = new boolean[nums.length];
//        dp[nums.length-1] = true;
//
//        for (int i=nums.length-2; i>=0; i--) {
//            for (int j=1; (j<=nums[i]) && (i+j < nums.length); j++) {
//                if (dp[i + j]) {
//                    dp[i] = true;
//                    break;
//                }
//            }
//        }
//        return dp[0];
//    }

    //  TC = O(n)
    boolean canJump(int[] nums) {
        int dest = nums.length - 1;

        for (int i = dest - 1; i >= 0; i--) {
            if (i + nums[i] >= dest) {
                dest = i;
            }
        }

        return dest == 0;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
    }
}
