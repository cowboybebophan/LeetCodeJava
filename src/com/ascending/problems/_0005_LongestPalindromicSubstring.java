package com.ascending.problems;

public class _0005_LongestPalindromicSubstring {
    class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";
            String longest = "";
            String odd;
            String even;

            for (int i=0; i<s.length();i++){
                odd = findPalindrome(s, i, i);
                even = findPalindrome(s, i, i+1);
                if (odd.length() > longest.length()) longest = odd;
                if (even.length() > longest.length()) longest = even;
            }
            return longest;
        }
        public String findPalindrome(String s, int l, int r){
            while (l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                l--;
                r++;
            }
            return s.substring(l + 1, r);
        }
    }
}
