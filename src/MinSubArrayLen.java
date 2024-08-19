// LC 209
public class MinSubArrayLen {
    int find(int target, int[] nums) {
        int n= nums.length;
        int l=0;
        int r=0;
        int sum= 0;
        int ans= Integer.MAX_VALUE;
        int currLen= 0;
        while(r < n) { // run till the right pointer reaches end
            sum+= nums[r];
            while(sum >= target){ // if found potential ans then reduce the window and keep on updating the window i.e ans
                currLen= r - l + 1;
                ans= Math.min(ans, currLen);
                sum-= nums[l];
                l++; // shrinkiing window
            }
            r++;   // expanding window
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int target = 11;

        MinSubArrayLen minSubArrayLen = new MinSubArrayLen();
        int out = minSubArrayLen.find(target, arr);

        System.out.println(out);
    }
}
