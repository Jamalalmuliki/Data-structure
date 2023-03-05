
//
//To implement the clone() method for the DoublyLinkedList class in Java,
//        we can create a new instance of the DoublyLinkedList class and copy all the elements from the original list to the new list.
//        Since we are creating a deep copy, we need to create new nodes for each element in the original list.
//        Here's an example implementation of the clone() method for the DoublyLinkedList class:

public class Main {

    public DoublyLinkedList<T> clone() throws CloneNotSupportedException {
        DoublyLinkedList<T> newList = new DoublyLinkedList<>();
        Node<T> current = head;
        while (current != null) {
            newList.addLast(current.data);
            current = current.next;
        }
        return newList;
    }


}