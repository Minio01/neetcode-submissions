class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> cur = new ArrayList<>();

        Arrays.sort(nums);
        backtrack(nums, 0, cur);

        return result;
    }

    private void backtrack(int[] nums, int idx, List<Integer> cur) {
        result.add(new ArrayList<>(cur));

        for (int i = idx; i < nums.length; i++) {
            if (i != idx && nums[i] == nums[i-1]) {
                continue;
            }

            cur.add(nums[i]);
            backtrack(nums, i+1, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
