class Solution {
    private int start = 0, maxLen = 0;
    
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        
        for (int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);     // Odd length palindrome
            expandAroundCenter(s, i, i + 1); // Even length palindrome
        }
        return s.substring(start, start + maxLen);
    }
    
    private void expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Length = right - left - 1 (because loop stopped after mismatch)
        int len = right - left - 1;
        if (len > maxLen) {
            maxLen = len;
            start = left + 1;
        }
    }
}