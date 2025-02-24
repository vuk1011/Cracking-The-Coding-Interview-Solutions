package data_structures_util.singly_linked_list;

public class Node<T> {
     private T data;
     Node<T> next;

     Node(T data) {
         this.data = data;
         next = null;
     }

    @Override
    public String toString() {
        return data.toString();
    }
}
