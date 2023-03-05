
//
//a method with signature String concatenate(LinkedQueue q2) for a LinkedQueue class that takes all q2 elements and appends them,
//        we can use the tail of the original queue to append the elements of q2.
//        Since we want the process to run at time O(1), we can simply update the tail pointer of the original queue to point to the tail of q2,
//        and update the length of the original queue accordingly. We also need to return a string representation of all elements in both queues.
//        Here's an example implementation of the concatenate() method for the LinkedQueue class:
//


public class Main {


    public String concatenate(LinkedQueue<T> q2) {
        if (q2.isEmpty()) return toString();

        if (isEmpty()) {
            head = q2.head;
            tail = q2.tail;
            length = q2.length;
        } else {
            tail.next = q2.head;
            tail = q2.tail;
            length += q2.length;
        }
        // clear q2
        q2.head = null;
        q2.tail = null;
        q2.length = 0;

        return toString();
    }

}