package com.ascending.problems;

import java.util.HashMap;
import java.util.Map;

public class _0003_LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int maxLength = 0, start = 0;
            Map<Character,Integer> usedChar = new HashMap();

            for (int i = 0; i < s.length(); i ++){
                if (usedChar.containsKey(s.charAt(i)) && start <= usedChar.get(s.charAt(i))){
                    start = usedChar.get(s.charAt(i)) + 1;
                }else{
                    maxLength = Math.max(maxLength, i - start + 1);
                }
                usedChar.put(s.charAt(i), i);
            }

            return maxLength;
        }
    }
}
