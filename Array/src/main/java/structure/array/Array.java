package structure.array;

import java.util.Iterator;

public class Array <T> implements Iterable <T> {

    private final Integer length;
    private T[] array;

    public Array(Integer length) {
        this.length = length;
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
                return Array.this.array[++this.index];
            }
        };
    }

}
