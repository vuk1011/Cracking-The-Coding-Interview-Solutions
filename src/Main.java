import data_structures_util.singly_linked_list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.appendToTail(Integer.valueOf(1));
        lista.appendToTail(Integer.valueOf(2));
        lista.appendToTail(Integer.valueOf(3));
        lista.print();
    }
}