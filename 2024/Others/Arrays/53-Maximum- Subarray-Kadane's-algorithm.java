class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max_sum = Integer.MIN_VALUE; // maximum sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if ( sum > max_sum) max_sum = sum;

            // If sum < 0: discard the sum calculated
            if ( sum <= 0 ) sum = 0;

        }


        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return max_sum;
    }
}
