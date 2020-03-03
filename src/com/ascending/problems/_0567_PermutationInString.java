package com.ascending.problems;

public class _0567_PermutationInString {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length())
                return false;

            int[] temp1 = new int[26];
            for (int i = 0; i < s1.length(); i ++){
                temp1[s1.charAt(i) - 'a'] ++;
            }

            for (int i = 0; i <= s2.length() - s1.length(); i ++){
                int[] temp2 = new int[26];
                for (int j = i; j < i + s1.length(); j ++){
                    temp2[s2.charAt(j) - 'a'] ++;
                }
                if (matches(temp1, temp2)) return true;
            }
            return false;
        }

        public boolean matches(int[] s1, int[] s2){
            for (int i = 0; i < s1.length; i ++){
                if (s1[i] != s2[i]) return false;
            }
            return true;
        }
    }
}
