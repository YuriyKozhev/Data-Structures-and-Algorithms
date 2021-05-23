package com.yuriy;

import java.util.NoSuchElementException;

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
    private int size;

    public LinkedList() {
        first = last = null;
        size = 0;
    }

    public void addFirst(int value) {
        if (isEmpty())
            first = last = new Node(value);
        else
            first = new Node(value, first);
        size++;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            output.append(current.value);
            output.append(", ");
            current = current.next;
        }
        output.delete(output.length() - 2,output.length()); // delete extra ", "
        output.append("]");
        return output.toString();
    }

    public void addLast(int value) {
        if (isEmpty())
            first = last = new Node(value);
        else {
            last.next = new Node(value);
            last = last.next;
        }
        size++;
    }

    public void deleteFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (size != 1) {
            Node newFirst = first.next;
            first = null; // remove link to deleted Node
            first = newFirst;
        }
        else {
            first = last = null;
        }
        size--;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (size != 1) {
            Node secondToLast = getPrevious(last);
            secondToLast.next = null; // remove link to deleted Node
            last = secondToLast;
        }
        else {
            first = last = null;
        }
        size--;
    }

    private Node getPrevious(Node current) {
        Node previous = first.next;
        while (previous.next != current)
            previous = previous.next;
        return previous;
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

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var current = first;
        int i = 0;
        while (current != null) {
            array[i] = current.value;
            current = current.next;
            i++;
        }
        return array;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}
