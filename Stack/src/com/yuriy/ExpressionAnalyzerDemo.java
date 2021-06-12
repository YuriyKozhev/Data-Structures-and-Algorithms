package com.yuriy;

public class ExpressionAnalyzerDemo {
    public static void show() {
        System.out.println(ExpressionAnalyzer.isBalanced("(a+[b]>"));
        System.out.println(ExpressionAnalyzer.isBalanced("(a+[b])"));
        System.out.println(ExpressionAnalyzer.isBalanced("(a+[b]"));
        System.out.println(ExpressionAnalyzer.isBalanced("(a+]b[)"));
    }
}
