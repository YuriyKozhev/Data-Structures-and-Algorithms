package com.yuriy;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(5);
        list.addLast(1);
        System.out.println(list.size());
        list.deleteFirst();
        list.deleteLast();
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.contains(0));
        System.out.println(list.indexOf(5));
        System.out.println(list.indexOf(0));
        System.out.println(list.size());
    }
}
