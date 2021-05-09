package com.yuriy;

public class Main {

    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(1);
        array.print();
        array.insert(2);
        array.print();
        array.removeAt(1);
        array.print();
    }
}
