
//    To implement the size() method for the DoublyLinkedList class,
//            assuming that we did not maintain size as an instance variable in Java,
//            we can use the following algorithm:
//            1. Traverse the list from its head node to its trailer node, counting each node as we go.
//            2. Return the count.
//    Here is a sample implementation of this algorithm in Java:

    public class Main {
    public int size() {
        // Traverse list and count nodes
        int count = 0;
        Node current = head.next;
        while (current != trailer) {
            count++;
            current = current.next;
        }

        return count;
    }}