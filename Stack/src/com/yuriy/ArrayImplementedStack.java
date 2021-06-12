package com.yuriy;

import java.util.Arrays;

public class ArrayImplementedStack {
    private int[] data;
    private int pointer;

    public ArrayImplementedStack() {
        data = new int[0];
        pointer = 0;
    }

    public void push(int val) {
        if (isFull())
            resize();

        data[pointer++] = val;
    }

    public int pop() {
        return 0;
    }

    public int peek() {
        return 0;
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    @Override
    public String toString() {
        return "ArrayImplementedStack{" +
                "data=" + Arrays.toString(Arrays.copyOfRange(data,0,pointer)) +
                '}';
    }

    private boolean isFull() {
        return !(pointer < data.length);
    }

    private void resize() {
       data = Arrays.copyOf(data,data.length * 2 + 1);
    }
}
