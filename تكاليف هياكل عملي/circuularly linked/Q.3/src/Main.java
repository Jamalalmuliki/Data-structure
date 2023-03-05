//To implement the equals() method for the CircularlyLinkedList class,
//        assuming that two lists are equal if they have the same sequence of elements,
//        with corresponding elements currently at the front of the list,
//        we can compare each element of both lists in order.


public class Main {
    public boolean equals(Object o) {
        if (o == this) { // check if same object
            return true;
        }
        if (!(o instanceof CircularlyLinkedList)) { // check if same type
            return false;
        }
        CircularlyLinkedList<?> other = (CircularlyLinkedList<?>) o;
        if (size() != other.size()) { // check if same size
            return false;
        }
        Node<E> walkA = tail.getNext();
        Node<?> walkB = other.tail.getNext();
        while (walkA != tail) { // compare each element in order
            if (!walkA.getElement().equals(walkB.getElement())) {
                return false;
            }
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true; // all elements are equal
    }
}