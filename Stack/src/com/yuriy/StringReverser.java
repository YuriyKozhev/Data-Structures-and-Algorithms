package com.yuriy;

import java.util.Stack;

public class StringReverser {
    public static String reverse(String s) {
        Stack<Character> stack = new Stack<>();

        for (var ch : s.toCharArray())
            stack.push(ch);

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());

        return sb.toString();
    }
}
