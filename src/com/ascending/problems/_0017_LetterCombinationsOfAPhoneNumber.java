package com.ascending.problems;

import java.util.ArrayList;
import java.util.List;

public class _0017_LetterCombinationsOfAPhoneNumber {
    class IterativeSolution {
        public List<String> letterCombinations(String digits) {
            List<String> res = new ArrayList<>();
            if (digits == null || digits.length() == 0) return res;
            String[] digitLetters = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

            res.add("");

            for (int i = 0; i < digits.length(); i++){
                List<String> updateRes = new ArrayList();
                String letters = digitLetters[digits.charAt(i) - '0'];
                for (int j=0;j<letters.length();j++){
                    for (String s : res){
                        updateRes.add(s + letters.charAt(j));
                    }
                }
                res = updateRes;
            }
            return res;
        }
    }
}
