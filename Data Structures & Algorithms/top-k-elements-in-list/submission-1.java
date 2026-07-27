class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        int cur = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int cnt = map.get(key);
            if (buckets[cnt] == null) {
                buckets[cnt] = new ArrayList<>();
            }
            buckets[cnt].add(key);
        }

        for (int i = nums.length; i >= 0; i--) {
            if (buckets[i] != null && cur < k) {
                for (int n : buckets[i]) {
                    res[cur] = n;
                    cur++;
                }
            }
        }

        return res;
    }
}
