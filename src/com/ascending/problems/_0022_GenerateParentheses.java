package com.ascending.problems;

import java.util.ArrayList;
import java.util.List;

public class _0022_GenerateParentheses {
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            if (n == 0) return res;

            generate(n, n, res, "");
            return res;
        }

        public void generate(int left, int right, List<String> res, String path){
            if (left > 0) generate(left - 1, right, res, path + '(');
            if (left < right) generate(left, right - 1, res, path + ')');
            if (right == 0) res.add(path);
        }
    }
}
