package gb_collections.lists;

import gb_collections.Gblist;
import gb_collections.lists.util.ArrayIterator;

import java.util.Iterator;

public class GbLinkedList<L> implements Gblist<L> {
    private L[] values;
    private int size;
    private Node<L> head;


    public GbLinkedList() {
        this.size = size;
        this.values = (L[]) new Object[size];
    }
    @Override
    public void add(L value) {

        if (head == null) {
            this.head = new Node<>(value);
        } else {
            Node<L> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node<>(value);
        }
        size++;
    }

    @Override
    public void add(int index, L value) {
        values[index] = value;
    }

    @Override
    public L get(int index) {
        int count = 0;
        Node<L> current = head;
        while (count != index) {
            current = current.next;
            count++;
        }
        return current.value;
    }
    @Override
    public void removeByIndex(int index) {
        if (index == 0){
            head = head.next != null ? head = head.next : null;
            size= size - 1;
            return;
        }
        int count = 0;
        Node<L> prev = null;
        Node<L> current = head;
        while (count != index) {
            prev = current;
            current = current.next;
            count++;
        }
        if (prev != null) {
            prev.next = current.next;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<L> iterator() {
        return new ArrayIterator<L>(toArray());
    }
    public L[] toArray() {
        L[] result = (L[]) new Object[size];
        Node<L> prev = null;
        Node<L> current = head;
        int i = 0;
        while (current.next != null){
            result[i] = current.value;
            current = current.next;
            i++;
        }
        return result;
    }
    private static class Node<L> {
        private L value;
        private Node<L> next;

        public Node(L value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
    public String toString() {
        StringBuilder builder = new StringBuilder("");
        Node<L> current = head;
        while (current != null) {
            builder.append(current.value).append(", ");
            current = current.next;
        }
        builder.append("");
        return builder.toString();
    }
}
