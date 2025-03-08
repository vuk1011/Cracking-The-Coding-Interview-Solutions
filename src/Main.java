import data_structures_util.singly_linked_list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.appendToTail(1);
        lista.appendToTail(2);
        lista.appendToTail(3);
        lista.print();

        lista.deleteNode(3);
        lista.print();
        lista.deleteNode(2);
        lista.print();
        lista.deleteNode(1);
        lista.print();
    }
}