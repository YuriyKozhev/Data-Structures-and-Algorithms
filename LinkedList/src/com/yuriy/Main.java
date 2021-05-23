package com.yuriy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(5);
        list.addLast(1);
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        list.reverseAnotherApproach();
        System.out.println(list);
        list.reverse();
        System.out.println(list);
        System.out.println(list.getKthFromTheEnd(3));
    }
}
