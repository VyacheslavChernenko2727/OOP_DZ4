package gb_collections;

public interface Gblist<T> extends Iterable<T>{
        void add(T value);
        void add(int index, T value);
        T get(int index);
        void removeByIndex(int index);
        int size();
}
