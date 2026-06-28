class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> current = new ArrayList<>();

        Arrays.sort(nums);
        backtrack(nums, target, current, 0);

        return result;
    }

    private void backtrack(int[] nums, int remains, List<Integer> current, int idx) {
        if (remains == 0) {
            result.add(new ArrayList(current));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            if (nums[i] > remains) {
                break;
            }

            current.add(nums[i]);
            backtrack(nums, remains - nums[i], current, i);
            current.remove(current.size() - 1);
        }
    }
}
