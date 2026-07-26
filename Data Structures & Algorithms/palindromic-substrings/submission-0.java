class Solution {
    public int countSubstrings(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result += help(s, i, i+1);
            result += help(s, i, i);
        }

        return result;
    }

    private int help(String s, int l, int r) {
        int counter = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            r++;
            l--;
            counter++;
        }

        return counter;
    }
}
