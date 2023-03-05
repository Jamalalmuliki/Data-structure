
//To implement a circular version of a doubly linked list in Java that supports all the public behaviors of the original as well as two new update methods,
//        rotate() and rotateBackward(),
//        we can modify the original doubly linked list implementation to make it circular.
//        In a circular doubly linked list,
//        the last node points to the first node and the first node points to the last node.
//        This creates a circular structure where we can traverse the list in both directions indefinitely[1].
//        Here's an example implementation of a circular doubly linked list in Java that supports
//        all the public behaviors of the original as well as two new update methods, rotate() and rotateBackward():








public class Main {
    private Node<T> head;
    private int size;

    public CircularDoublyLinkedList() {
        head = null;
        size = 0;
    }

    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Add element at head
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.next = head.prev = head; // make it circular
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode; // update prev pointer of first node
            head = newNode; // update the head
        }
        size++;
    }

    // Add element at tail
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            addFirst(data);
        } else {
            newNode.next = head; // point to first node
            newNode.prev = head.prev; // point to last node
            head.prev.next = newNode; // update next pointer of last node
            head.prev = newNode; // update prev pointer of first node
            size++;
        }
    }

    // Remove element from front
    public T removeFirst() throws NoSuchElementException{
        if(head==null)
            throw new NoSuchElementException();

        T temp=head.data;

        if(head==head.next){

            deleteList();

            return temp;

        }


        var current=head;

        current=current -> next;

        current -> prev=head -> prev;

        delete(head);

        current -> prev -> next=current;


        this.head=current;


        size--;

        return temp;



    }

    // Remove element from back

    public T removeLast() throws NoSuchElementException{

        if(head==null)
            throw new NoSuchElementException();


        T temp=head -> prev.data;


        if(head==head -> prev){

            deleteList();

            return temp;


        }


        var current=head -> prev;

        current=current -> prev;

        current -> next=head;

        delete(current -> next);

        current -> next ->prev=current;


        size--;

        return temp;




    }



    private void deleteList(){

        var current=head;



        while(current!=null && current !=current->prev){

            var temp=current->next;

            delete(current);

            current=temp;



        }



        this.head=null;



    }




    public void rotate(int k){

        for(int i=0;i<k;i++)
            rotateOnce();



    }



    private void rotateOnce(){

        if(head==null ||head==head->prev)
            return ;

        var lastNode=head->prev;//get lastNode

        var secondNode=head->nextpublic class CircularDoublyLinkedList<T> {
            private Node<T> head;
            private int size;

            public CircularDoublyLinkedList() {
                head = null;
                size = 0;
            }

            private static class Node<T> {
                T data;
                Node<T> next;
                Node<T> prev;

                public Node(T data) {
                    this.data = data;
                    this.next = null;
                    this.prev = null;
                }
            }

            // Add element at head
            public void addFirst(T data) {
                Node<T> newNode = new Node<>(data);
                if (head == null) {
                    head = newNode;
                    head.next = head.prev = head; // make it circular
                } else {
                    newNode.next = head;
                    newNode.prev = head.prev;
                    head.prev.next = newNode;
                    head.prev = newNode; // update prev pointer of first node
                    head = newNode; // update the head
                }
                size++;
            }

            // Add element at tail
            public void addLast(T data) {
                Node<T> newNode = new Node<>(data);
                if (head == null) {
                    addFirst(data);
                } else {
                    newNode.next = head; // point to first node
                    newNode.prev = head.prev; // point to last node
                    head.prev.next = newNode; // update next pointer of last node
                    head.prev = newNode; // update prev pointer of first node
                    size++;
                }
            }

            // Remove element from front
            public T removeFirst() throws NoSuchElementException{
                if(head==null)
                    throw new NoSuchElementException();

                T temp=head.data;

                if(head==head.next){

                    deleteList();

                    return temp;

                }


                var current=head;

                current=current -> next;

                current -> prev=head -> prev;

                delete(head);

                current -> prev -> next=current;


                this.head=current;


                size--;

                return temp;



            }

            // Remove element from back

            public T removeLast() throws NoSuchElementException{

                if(head==null)
                    throw new NoSuchElementException();


                T temp=head -> prev.data;


                if(head==head -> prev){

                    deleteList();

                    return temp;


                }


                var current=head -> prev;

                current=current -> prev;

                current -> next=head;

                delete(current -> next);

                current -> next ->prev=current;


                size--;

                return temp;




            }



            private void deleteList(){

                var current=head;



                while(current!=null && current !=current->prev){

                    var temp=current->next;

                    delete(current);

                    current=temp;



                }



                this.head=null;



            }




            public void rotate(int k){

                for(int i=0;i<k;i++)
                    rotateOnce();



            }



            private void rotateOnce(){

                if(head==null ||head==head->prev)
                    return ;

                var lastNode=head->prev;//get lastNode

                var secondNode=head->next}