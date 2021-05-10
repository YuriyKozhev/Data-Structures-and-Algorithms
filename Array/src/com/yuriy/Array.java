package com.yuriy;

public class Array {
    private int[] data;
    private int currentIndex;

    public Array(int length) {
        data = new int[length];
        currentIndex = 0;
    }

    public void insert(int item) {
        if (currentIndex == data.length)
            extendArray();
        data[currentIndex++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= currentIndex)
            throw new IllegalArgumentException("Incorrect index");
        for (int i = index; i < currentIndex; i++)
            data[i] = data[i + 1];
        currentIndex--;
    }

    public void print() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    private void extendArray() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public int indexOf(int item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item)
                return i;
        }
        return -1;
    }

}
