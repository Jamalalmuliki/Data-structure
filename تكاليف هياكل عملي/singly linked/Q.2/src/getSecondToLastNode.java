//Here is an algorithm to find the second-to-last node in a singly linked list in which the last node is indicated by a null next reference in Java:
//1. Initialize two pointers, current and previous, to point to the first node of the linked list.
//2. Traverse the linked list until current.next is null, indicating that current is pointing to the last node of the list.
//3. While traversing, keep updating previous to point to the previous node of current.
//4. Once you reach the end of the list, return previous, which will be pointing to the second-to-last node.


    public Node getSecondToLastNode(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        return previous;
    }