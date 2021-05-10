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
//        last.value = value;
//        Node newLast = new Node(0, null);
//        last.next = newLast;
//        last = newLast;
    }

    public void deleteFirst() {
//        first = first.next;
//        first.value = 0;
    }

    public void deleteLast() {
//        Node secondToLast = first.next;
//        while (secondToLast.next != last)
//            secondToLast = secondToLast.next;
//        secondToLast.next = null;
//        secondToLast.value = 0;
//        last = secondToLast;
    }

    public boolean contains(int value) {
//        Node current = first.next;
//        while (current != last) {
//            if (current.value == value)
//                return true;
//            current = current.next;
//        }
        return false;
    }

    public int indexOf(int value) {
//        Node current = first.next;
//        int i = 0;
//        while (current != last) {
//            if (current.value == value)
//                return i;
//            current = current.next;
//            i++;
//        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
