package com.ascending.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static javax.swing.UIManager.put;

public class _0020_ValidParentheses {
    class Solution1 {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack();
            Map<Character, Character> map = new HashMap() {{
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }};

            for (int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if (map.containsKey(c)){
                    char topElement = stack.isEmpty() ? '*':stack.pop();
                    if (topElement != map.get(c)) return false;

                } else {
                    stack.push(c);
                }
            }
            return stack.isEmpty();
        }
    }

    class Solution2 {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack();
            for (char c : s.toCharArray()){
                if (c == '(') stack.push(')');
                else if (c == '[') stack.push(']');
                else if (c == '{') stack.push('}');
                else if (stack.isEmpty() || c != stack.pop()) return false;
            }
            return stack.isEmpty();
        }
    }
}
