


//    To find the middle node of a doubly linked list with head guards and trailer by navigation link,
//            and without dependence based on explicit knowledge of the size of the list in Java,
//            we can use the following algorithm:
//            1. Traverse the list using two pointers, slow and fast,
//            starting from the first node after the head guard.
//            2. Move slow one step at a time and fast two steps at a time until fast reaches the trailer or
//            its next node is the trailer.
//            3. The node pointed to by slow is now at the middle of the list.
//    Here is a sample implementation of this algorithm in Java:

    public class Main {
    public Node findMiddleNode() {
        // Initialize slow and fast pointers
        Node slow = head.next;
        Node fast = head.next;

        // Traverse list until fast reaches trailer or its next node is trailer
        while (fast != trailer && fast.next != trailer) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Return middle node
        return slow;
    }


}