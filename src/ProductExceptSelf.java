// LC#238 Blind75#4

import java.util.Arrays;

public class ProductExceptSelf {
    int[] products(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int[] ans = new int[nums.length];

        pre[0] = 1;
        for (int i=1; i<nums.length; i++) {
            pre[i] = pre[i-1]*nums[i-1];
        }

        post[nums.length - 1] = 1;
        for (int i=nums.length-2; i>=0; i--) {
            post[i] = post[i+1]*nums[i+1];
        }

        ans[0] = post[0];
        ans[nums.length-1] = pre[nums.length-1];
        for (int i=1; i<nums.length-1; i++) {
            ans[i] = pre[i] * post[i];
        }
//        System.out.println(Arrays.toString(pre));
//        System.out.println(Arrays.toString(post));
//        System.out.println(Arrays.toString(ans));
        return ans;
    }

    public static void main(String[] args) {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        System.out.println(Arrays.toString(productExceptSelf.products(new int[]{1, 2, 4, 6})));
        System.out.println(Arrays.toString(productExceptSelf.products(new int[]{-1, 1, 0, 3, -3})));
    }
}
