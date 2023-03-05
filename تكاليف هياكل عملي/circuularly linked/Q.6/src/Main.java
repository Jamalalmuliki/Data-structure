//
//    To implement the clone() method for the CircularlyLinkedList class in Java, we can use the following algorithm:
//            1. Create a new instance of CircularlyLinkedList to hold the cloned list.
//            2. Traverse the original list and create a new node for each element, copying its data value to the new node.
//3. Set the next pointer of each new node to point to the next node in the original list.
//4. Set the next pointer of the last new node to point back to the head of the cloned list.
//5. Return the cloned list.
//    Here is a sample implementation of this algorithm in Java:

    public class Main {
    public CircularlyLinkedList clone() {
        // Create new instance of CircularlyLinkedList
        CircularlyLinkedList clonedList = new CircularlyLinkedList();

        if (head != null) {
            // Traverse original list and create new nodes with same data values
            Node current = head;
            do {
                Node newNode = new Node(current.data);
                clonedList.add(newNode);
                current = current.next;
            } while (current != head);

            // Set next pointers of cloned nodes
            Node currentCloned = clonedList.head;
            current = head;
            do {
                currentCloned.next = clonedList.head;  // set last node's next pointer to head
                currentCloned = currentCloned.next;
                current = current.next;
            } while (current != head);
        }

        return clonedList;
    }}