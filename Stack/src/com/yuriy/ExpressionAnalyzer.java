package com.yuriy;

import javax.sound.midi.Soundbank;
import java.util.*;

public class ExpressionAnalyzer {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        Set<Character> openingParentheses = new HashSet<>(Arrays.asList('(', '{', '[', '<'));
        Set<Character> closingParentheses = new HashSet<>(Arrays.asList(')', '}', ']', '>'));

        for (var ch : expression.toCharArray()) {
            if (openingParentheses.contains(ch)) {
                stack.push(ch);
            }
            else if (closingParentheses.contains(ch)) {
                if (stack.isEmpty())
                    return false;

                var last = stack.pop();
                if (ch == ')' && last != '(') return false;
                if (ch == ']' && last != '[') return false;
                if (ch == '}' && last != '{') return false;
                if (ch == '>' && last != '<') return false;
            }
        }
        return stack.isEmpty();
    }
}
