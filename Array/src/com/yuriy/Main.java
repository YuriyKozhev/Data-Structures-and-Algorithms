package com.yuriy;

public class Main {

    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(1);
        array.print();
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.print();
        array.removeAt(1);
        array.print();
        System.out.println(array.indexOf(4));
        System.out.println(array.indexOf(2));
    }
}
