package com.yuriy;

public class LinkedList {
    private Node first;
    private Node last;

    public LinkedList() {
        last = new Node(0, null);
        first = new Node(0, last);
    }

    public void addFirst(int value) {
        first.setValue(value);
        first = new Node(0, first);
    }

    @Override
    public String toString() {
        String s = "[";
        Node current = first.getNext();
        while (current != last) {
            s += current.getValue();
            s += ", ";
            current = current.getNext();
        }
        s += "]";
        return s;
    }

    public void addLast(int value) {
        last.setValue(value);
        Node newLast = new Node(0, null);
        last.setNext(newLast);
        last = newLast;
    }

    // deleteFirst
    // deleteLast
    // contains
    // indexOf
}
