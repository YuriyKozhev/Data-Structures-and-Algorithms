package com.yuriy;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node first;
    private Node last;

    public LinkedList() {
        first = last = null;
    }

    public void addFirst(int value) {
        if (isEmpty())
            first = last = new Node(value);
        else
            first = new Node(value, first);
    }

    @Override
    public String toString() {
        String s = "[";
        Node current = first;
        while (current != null) {
            s += current.value;
            s += ", ";
            current = current.next;
        }
        s += "]";
        return s;
    }

    public void addLast(int value) {
        last.next = new Node(value);
        last = last.next;
    }

    public void deleteFirst() {
        if (isEmpty())
            return;

        // List contains exactly 1 element
        if (first == last) {
            first = last = null;
            return;
        }

        Node newFirst = first.next;
        first = null; // remove link to deleted Node
        first = newFirst;
    }

    public void deleteLast() {
        if (isEmpty())
            return;

        // List contains exactly 1 element
        if (first == last) {
            first = last = null;
            return;
        }

        Node secondToLast = first.next;
        while (secondToLast.next != last)
            secondToLast = secondToLast.next;

        secondToLast.next = null; // remove link to deleted Node
        last = secondToLast;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public int indexOf(int value) {
        Node current = first;
        int i = 0;
        while (current != null) {
            if (current.value == value)
                return i;
            current = current.next;
            i++;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
