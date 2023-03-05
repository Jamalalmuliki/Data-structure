
//To implement a rotate() method in the SinglyLinkedList class in Java, which has semantics equal to addLast(removeFirst()), yet without creating any new node, we can follow the below steps:
//1. Check if the head of the linked list is null or there is only one node in the linked list. If yes, then return as there is no need to rotate.
//2. Traverse the linked list till kth node from the head of the linked list.
//3. Set a pointer to kth node and another pointer to head of the linked list.
//4. Traverse both pointers until we reach the last node of the linked list.
//5. Set next of last node to head of original linked list and set next of kth node as head of new rotated linked list.
//6. Set head of original linked list as next of kth node.



public class Main {
    public void rotate(int k) {
        if (head == null || head.next == null || k == 0) {
            return;
        }

        Node current = head;
        int count = 1;

        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return;
        }

        Node kthNode = current;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head;

        head = kthNode.next;

        kthNode.next = null;
    }
}