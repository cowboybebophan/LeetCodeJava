package com.ascending.problems;

import java.util.HashMap;
import java.util.Map;

public class _0242_ValidAnagram {
    class MapSolution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            Map<Character, Integer> map = new HashMap();

            for (int i = 0; i < s.length(); i ++){
                char c1 = s.charAt(i);
                if (map.containsKey(c1)){
                    map.put(c1, map.get(c1) + 1);
                }else{
                    map.put(c1, 1);
                }
            }

            for (int j = 0; j < t.length(); j ++){
                char c2 = t.charAt(j);
                if (map.containsKey(c2)){
                    map.put(c2, map.get(c2) - 1);
                    if (map.get(c2) == 0) map.remove(c2);
                }else{
                    return false;
                }
            }
            return map.isEmpty();
        }
    }

    class ArraySolution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            int[] count = new int[26];
            for (int i = 0;i < s.length(); i++) count[s.charAt(i) - 'a'] ++;
            for (int i = 0;i < t.length(); i++) count[t.charAt(i) - 'a'] --;

            for (int i:count) if (i != 0) return false;

            return true;
        }
    }
}
