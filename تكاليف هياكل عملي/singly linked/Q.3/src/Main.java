

//If the size of a singly linked list is not maintained as an instance variable,
// we can still calculate the size of the list by traversing through all the nodes in the list and counting them.




public class Main {
    public static void main(String[] args) {
        public int size() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }
}