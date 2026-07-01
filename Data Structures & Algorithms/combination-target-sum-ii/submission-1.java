class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates, target, 0, current);

        return result;
    }

    private void backtrack(int nums[], int div, int idx, List<Integer> cur) {
        if (div == 0) {
            result.add(new ArrayList<>(cur));
            return;
        }
        
        for (int i = idx; i < nums.length; i++) {
            if (nums[i] > div) {
                break;
            }
            if ((i > idx) && (nums[i-1] == nums[i])) continue;

            cur.add(nums[i]);
            backtrack(nums, div - nums[i], i+1, cur);
            cur.remove(cur.size() - 1);
        }
    }
}