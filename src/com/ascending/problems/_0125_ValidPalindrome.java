package com.ascending.problems;

public class _0125_ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            if (s == null || s.length() == 0) return true;

            int left = 0, right = s.length() - 1;
            char leftChar, rightChar;

            while (left <= right){
                leftChar = s.charAt(left);
                rightChar = s.charAt(right);
                if (!Character.isLetterOrDigit(leftChar)){
                    left ++;
                } else if (!Character.isLetterOrDigit(rightChar)){
                    right --;
                } else{
                    if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                        return false;
                    }
                    left ++;
                    right --;
                }
            }
            return true;

        }
    }
}
