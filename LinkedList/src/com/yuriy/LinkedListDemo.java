package com.yuriy;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void show() {
        LinkedList<Integer> list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(20));
        System.out.println(list.size());
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
