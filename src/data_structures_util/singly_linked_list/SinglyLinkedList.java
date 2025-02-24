package data_structures_util.singly_linked_list;

public class SinglyLinkedList<T> {
    private Node<T> head;

    public SinglyLinkedList() {
        head = null;
    }

    public void appendToTail(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.print(tmp + " -> ");
            tmp = tmp.next;
        }
        System.out.println("null");
    }
}
