public class Main {
        public void addFirst(E e) {
            if (size == 0) {
                tail = new Node<>(e, null);
                tail.setNext(tail);
            } else {
                tail.setNext(new Node<>(e, tail.getNext()));
            }
            size++;
        }
    }
//In this version of the method, we create a new node with the given element and set its next reference to the current head of the list (which is tail.getNext()). We then set the next reference of tail to point to this new node. This effectively inserts the new node at the beginning of the list.
//        Note that we don't need to declare a local variable newest in this version of the method because we can directly create and manipulate nodes using their constructors and methods.