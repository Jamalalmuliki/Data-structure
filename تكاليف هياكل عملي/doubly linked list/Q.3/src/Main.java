

//    To implement the equals() method for the DoublyLinkedList class in Java,
//    we can use the following algorithm:
//            1. Check if the object being compared is null or not an instance of DoublyLinkedList.
//            If it is, return false.
//            2. Cast the object to a DoublyLinkedList and compare its size to this list's size.
//            If they are not equal, return false.
//            3. Traverse both lists simultaneously,
//            comparing each node's data value to the corresponding node in the other list.
//            If any pair of nodes do not match, return false.
//            4. If all nodes match, return true.
//    Here is a sample implementation of this algorithm in Java:

    public class Main {
    public boolean equals(Object obj) {
        // Check if object is null or not an instance of DoublyLinkedList
        if (obj == null || !(obj instanceof DoublyLinkedList)) {
            return false;
        }

        // Cast object to DoublyLinkedList and compare sizes
        DoublyLinkedList other = (DoublyLinkedList) obj;
        if (size() != other.size()) {
            return false;
        }

        // Traverse both lists and compare nodes' data values
        Node current = head.next;
        Node otherCurrent = other.head.next;
        while (current != trailer) {
            if (!current.data.equals(otherCurrent.data)) {
                return false;
            }
            current = current.next;
            otherCurrent = otherCurrent.next;
        }

        // If all nodes match, return true
        return true;
    }

}