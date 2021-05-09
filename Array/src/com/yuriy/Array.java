package com.yuriy;

public class Array {
    private int[] data;
    private int length;
    private int currentIndex;

    public Array(int length) {
        this.length = length;
        data = new int[length];
        currentIndex = 0;
    }

    public void insert(int item) {
        if (currentIndex == length)
            extendArray();
        data[currentIndex++] = item;
    }

    public void removeAt(int index) {
        int[] newData = new int[--length];
        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }
        for (int i = index + 1; i < data.length; i++) {
            newData[i - 1] = data[i];
        }
        data = newData;
    }

    public void print() {
        for (var item :
                data) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    private void extendArray() {
        int[] newData = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newData[i] = data[i];
        }
        data = newData;
        length++;
    }

    public int indexOf(int item) {
        for (int i = 0; i < length; i++) {
            if (data[i] == item)
                return i;
        }
        return -1;
    }

}
