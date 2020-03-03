package com.ascending.data_structures.String;

public class _0344_ReverseString {

    // Time: O(n) Space: O(1)
    class Solution {
        public void reverseString(char[] s) {
            int left = 0, right = s.length - 1;
            while (left < right){
                char temp = s[left];
                s[left++] = s[right];
                s[right--] = temp;
            }
        }
    }
}
