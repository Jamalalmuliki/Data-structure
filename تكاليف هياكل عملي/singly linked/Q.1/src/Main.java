

//To implement the equals() method in the context of a singly linked list class in Java,
// we need to compare each element of the two lists. Here is the implementation:



public class Main {
    public boolean equals(SinglyLinkedList other) {
        if (this.size() != other.size()) {
            return false;
        }
        Node currentThis = this.head;
        Node currentOther = other.head;
        while (currentThis != null && currentOther != null) {
            if (!currentThis.data.equals(currentOther.data)) {
                return false;
            }
            currentThis = currentThis.next;
            currentOther = currentOther.next;
        }
        return true;
    }
}