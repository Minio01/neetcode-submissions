class Solution {
    public boolean canPartition(int[] nums) {
        int avgSum = 0;
        for (int i = 0; i < nums.length; i++) {
            avgSum += nums[i];
        }

        if (avgSum % 2 == 1) {
            return false;
        }

        int target = avgSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = target; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }

        return dp[target];
    }
}
