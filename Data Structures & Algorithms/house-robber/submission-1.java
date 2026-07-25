class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        } if (len == 1) {
            return nums[0];
        }

        int[] mas = new int[len];
        mas[0] = nums[0];
        mas[1] = Math.max(nums[1], mas[0]);

        for (int i = 2; i < len; i++) {
            mas[i] = Math.max(mas[i-1], mas[i-2] + nums[i]);
        }

        return mas[len - 1];
    }
}
