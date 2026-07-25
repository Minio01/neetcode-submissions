class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] mas = new int[len];
        mas[0] = 0;
        mas[1] = 0;

        for (int i = 2; i < len; i++) {
            mas[i] = Math.min(mas[i-2]+cost[i-2], mas[i-1] + cost[i-1]);
        }

        return Math.min(mas[len - 1] + cost[len - 1], mas[len - 2] + cost[len - 2]);
    }
}
