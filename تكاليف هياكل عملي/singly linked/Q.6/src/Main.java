//    Here is an algorithm for reversing a singly linked list l using only a constant amount of additional space in Java:
//            1. Initialize three pointers previous, current, and next to null.
//            2. Traverse the linked list l from the head node to the tail node.
//            3. For each node, set next to point to the next node in the list, then set the next pointer of the current node to point to previous.
//            4. Move previous to point to the current node, then move current to point to the next node.
//            5. Repeat steps 3-4 until all nodes have been reversed.
//            6. Set the head of the reversed list to be equal to previous.
//            Here's how this algorithm can be implemented in Java:



public class Main {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next; // save reference to next node
            current.next = previous; // reverse link
            previous = current; // move previous pointer forward
            current = next; // move current pointer forward
        }

        return previous; // new head of reversed list
    }
}