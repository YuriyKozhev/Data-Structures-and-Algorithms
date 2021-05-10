package com.yuriy;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void show() {
        List<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 2);
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.contains(4));
        // remove by index
        list.remove(1);
        System.out.println(list);
        // remove by value (object)
        list.remove(Integer.valueOf(1));
        System.out.println(list);
    }
}
