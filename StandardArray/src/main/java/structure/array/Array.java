package structure.array;

import java.util.Iterator;
import java.util.function.Consumer;

public class Array <T> implements Iterable <T> {

    public Integer getLength() {
        return length;
    }

    private final Integer length;
    private T[] array;

    public void setItem(Integer pos, T val) {
        this.array[pos] = val;
    }

    public T getItem(@org.jetbrains.annotations.NotNull Integer pos) {
        return this.array[pos];
    }

    public Array(Integer length) {
        if (length < 0) throw new IllegalArgumentException("Negative length: " + length);
        this.length = length;
        this.array = (T[]) new Object[length];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Integer index = 0;

            @Override
            public boolean hasNext() {
                return this.index < Array.this.length;
            }

            @Override
            public T next() {
                return Array.this.array[this.index++];
            }
        };
    }
}
