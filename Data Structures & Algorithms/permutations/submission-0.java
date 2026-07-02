class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cur = new ArrayList<Integer>();
        boolean[] ables = new boolean[nums.length];

        help(nums, cur, ables);

        return res;
    }

    private void help(int[] nums, List<Integer> cur, boolean[] ables) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if (ables[i]) {
                continue;
            }
            cur.add(nums[i]);
            ables[i] = true;
            help(nums, cur, ables);
            cur.remove(cur.size() - 1);
            ables[i] = false;
        }
    }
}
