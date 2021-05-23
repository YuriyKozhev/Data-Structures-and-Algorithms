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

    private Node getPrevious(Node current) {
        Node previous = first.next;
        while (previous.next != current)
            previous = previous.next;
        return previous;
    }

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

    public boolean isEmpty() {
        return size == 0;
    }

    public void reverse() {
        if (isEmpty() || size == 1)
            return;

        Node previousNode = first;
        Node current = first.next;
        Node nextNode;
        while (current != null) {
            nextNode = current.next;

            current.next = previousNode;

            previousNode = current;
            current = nextNode;
        }
        last = first;
        last.next = null;
        first = previousNode;
    }

    public void reverseAnotherApproach() {
        Node current = first;

        Node afterLast;
        Node nextNode;
        while(current != last) {
            afterLast = last.next;
            nextNode = current.next;

            last.next = current;

            current.next = afterLast;

            current = nextNode;
        }
        last = first;
        first = current;
   }

    public int getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();

        Node firstNode = first;
        Node secondNode = first;

       for (int i = 0; i < k; i++) {
            if (secondNode == null)
                throw new IllegalArgumentException();
           secondNode = secondNode.next;
       }

        while (secondNode != null) {
           firstNode = firstNode.next;
           secondNode = secondNode.next;
        }

        return firstNode.value;
    }
}
