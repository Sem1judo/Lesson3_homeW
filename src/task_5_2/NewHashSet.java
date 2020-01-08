package task_5_2;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class NewHashSet<T> {
    private static final Integer INITIAL_CAPACITY = 16;

    private Node<T>[] buckets;

    private int size;

    public NewHashSet(final int capacity) {
        this.buckets = new Node[capacity];
        this.size = 0;
    }

    public NewHashSet() {
        this(INITIAL_CAPACITY);
    }

    public int getSize(){
        return size;
    }

    public void add(T t) {
        int index = hashCode(t) % buckets.length;

        Node bucket = buckets[index];

        Node<T> newNode = new Node<>(t);

        if (bucket == null) {
            buckets[index] = newNode;
            size++;
            return;
        }

        while (bucket.next != null) {
            if (bucket.data.equals(t)) {
                return;
            }
            bucket = bucket.next;
        }

        if (!bucket.data.equals(t)) {
            bucket.next = newNode;
            size++;
        }
    }

    private int hashCode(T t) {
        return t.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewHashSet<?> that = (NewHashSet<?>) o;
        return size == that.size &&
                Arrays.equals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(buckets);
        return result;
    }

    public T remove(T t) {
        int index = hashCode(t) % buckets.length;

        Node bucket = buckets[index];

        if (bucket == null) {
            throw new NoSuchElementException("No Element Found");
        }

        if (bucket.data.equals(t)) {
            buckets[index] = bucket.next;
            size--;
            return t;
        }

        Node prev = bucket;

        while (bucket != null) {
            if (bucket.data.equals(t)) {
                prev.next = bucket.next;
                size--;
                return t;
            }
            prev = bucket;
            bucket = bucket.next;
        }
        return null;
    }

}
