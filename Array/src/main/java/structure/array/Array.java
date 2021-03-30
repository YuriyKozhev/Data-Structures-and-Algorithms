package structure.array;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Array <T> implements Iterable <T> {

    private final Integer length;

    public Array(Integer length) {
        this.length = length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
