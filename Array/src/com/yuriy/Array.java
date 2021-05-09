package com.yuriy;

public class Array {
    private int[] data;
    private int length;

    public Array(int length) {
        this.length = length;
        data = new int[length];
    }

    public void insert(int item) {
        data = new int[length + 1];
        data[length] = item;
        length++;
    }

    public void removeAt(int index) {
        int[] newData = new int[--length];
        for (int i = 0; i < index; i++) {
            newData[i] = data[i];
        }
        if (data.length - index + 1 >= 0)
            System.arraycopy(data, index + 1, newData, index + 1 - 1, data.length - index + 1);
        data = newData;
    }

}
