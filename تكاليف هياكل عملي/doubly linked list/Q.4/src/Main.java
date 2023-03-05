

//    To merge two sorted linked lists l and m consisting of sentinel head and trailer nodes into one list in Java, we can use the following algorithm:
//            1. Create a new instance of DoublyLinkedList to hold the merged list.
//            2. Traverse both lists simultaneously, comparing each node's data value to the corresponding node in the other list.
//            3. Append the smaller node to the end of the merged list and move its pointer to its next node.
//4. Repeat step 3 until one of the lists reaches its trailer node.
//5. Append any remaining nodes from the other list to the end of the merged list.
//6. Return the merged list.
//    Here is a sample implementation of this algorithm in Java:

    public class Main {
    public static DoublyLinkedList mergeSortedLists(DoublyLinkedList l, DoublyLinkedList m) {
        // Create new instance of DoublyLinkedList
        DoublyLinkedList mergedList = new DoublyLinkedList();

        // Traverse both lists simultaneously and append smaller node to mergedList
        Node currentL = l.head.next;
        Node currentM = m.head.next;
        while (currentL != l.trailer && currentM != m.trailer) {
            if ((Integer) currentL.data < (Integer) currentM.data) {
                Node newNode = new Node(currentL.data);
                mergedList.add(newNode);
                currentL = currentL.next;
            } else {
                Node newNode = new Node(currentM.data);
                mergedList.add(newNode);
                currentM = currentM.next;
            }
        }

        // Append remaining nodes from other list to mergedList
        while (currentL != l.trailer) {
            Node newNode = new Node(currentL.data);
            mergedList.add(newNode);
            currentL = currentL.next;
        }

        while (currentM != m.trailer) {
            Node newNode = new Node(currentM.data);
            mergedList.add(newNode);
            currentM = currentM.next;
        }

        return mergedList;
    }
}