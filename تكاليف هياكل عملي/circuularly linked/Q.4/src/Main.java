
//To determine if two circularly linked lists l and m store the same sequence of elements
//        (but perhaps with different starting points) in Java, we can use the following algorithm:
//        1. Traverse the first list l and store each node's data value in an ArrayList.
//        2. Traverse the second list m, comparing each node's data value to the corresponding element in the ArrayList.
//        3. If all elements match, return true; otherwise, return false.


public class Main {
    public static boolean sameSequence(Node l, Node m) {
        // Create an ArrayList to store elements of list l
        ArrayList<Integer> listL = new ArrayList<Integer>();

        // Traverse list l and add each element to the ArrayList
        Node currentL = l;
        do {
            listL.add(currentL.data);
            currentL = currentL.next;
        } while (currentL != l);

        // Traverse list m and compare each element to the corresponding element in the ArrayList
        Node currentM = m;
        int i = 0;
        do {
            if (currentM.data != listL.get(i)) {
                return false;
            }
            currentM = currentM.next;
            i++;
        } while (currentM != m);

        // If all elements match, return true
        return true;
    }
}