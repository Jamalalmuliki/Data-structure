//To split a circularly linked list l containing an even number of nodes into two circularly linked lists of half the size in Java,
//        we can use the following algorithm:
//        1. Traverse the list l using the tortoise and hare algorithm to find the midpoint node.
//        2. Set the next pointer of the last node in l to point to the midpoint node, effectively making it a circular list.
//        3. Traverse l again from its head node until we reach the midpoint node, and set its next pointer to null to break it into two separate lists.
//        4. Return both halves as separate circularly linked lists.





public class Main {
    public static Node[] splitCircularList(Node l) {
        // Find midpoint using tortoise and hare algorithm
        Node slow = l;
        Node fast = l;
        while (fast.next != l && fast.next.next != l) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Set last node's next pointer to midpoint
        fast = slow.next;
        while (fast.next != l) {
            fast = fast.next;
        }
        fast.next = slow.next;

        // Break list into two halves
        slow.next = l;  // end first half at midpoint
        Node[] halves = {l, fast.next};  // second half starts at next node after midpoint

        return halves;
    }


}