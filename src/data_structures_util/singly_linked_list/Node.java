package data_structures_util.singly_linked_list;

public class Node<T> {
    public T data;
    public Node<T> next;

    public Node() {
        next = null;
    }

    public Node(T data) {
        this.data = data;
        next = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
