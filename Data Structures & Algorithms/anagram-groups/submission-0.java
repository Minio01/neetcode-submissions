class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            map.computeIfAbsent(new String(arr), k -> new ArrayList<>()).add(str);
        }

        for (List<String> lst : map.values()) {
            res.add(lst);
        }

        return res;
    }
}
