class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        s = s.toLowerCase();

        
        while (l < r) {
            while (l < s.length() && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (r >= 0 && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (l >= s.length() || r < 0) break;

            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false; 
            }
        }

        return true;
    }
}
