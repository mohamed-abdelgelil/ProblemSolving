package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(("));
        System.out.println(isValid("()))"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("{[}]"));
        System.out.println(isValid("{([])}"));
        System.out.println(isValid("("));
        System.out.println(isValid("()"));
        System.out.println(isValid("()]"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("(([))]]"));
        System.out.println(isValid("(([)[)]]"));
        System.out.println(isValid("(([(}{))]]"));
    }

    public static boolean isValid(String s) {
        if (s.isEmpty() || s.length() % 2 != 0) {
            return false;
        }
        if (s.startsWith(")") || s.startsWith("]") || s.startsWith("}")) {
            return false;
        }

        Map<String, String> prantheses = new HashMap<>();
        prantheses.put("(", ")");
        prantheses.put("[", "]");
        prantheses.put("{", "}");

        Stack<String> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(String.valueOf(ch));
            } else {
                if (st.size() > 0 && String.valueOf(ch).equals(prantheses.get(st.peek()))) {
                    st.pop();
                } else {
                    return false;
                }

            }

        }
        return st.size() <= 0;
    }


}
