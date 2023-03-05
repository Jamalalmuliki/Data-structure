//implement the clone() method for the ArrayQueue class in Java,
//        we can create a new instance of the ArrayQueue class and copy all the elements from the original queue to the new queue.
//        Since we are creating a deep copy,
//        we need to create new objects for each element in the original queue.

public class Main {
    ublic ArrayQueue<T> clone() throws CloneNotSupportedException {
        ArrayQueue<T> newQueue = new ArrayQueue<>(capacity);
        int i = front;
        while (i != rear) {
            T temp = data[i];
            newQueue.enqueue(temp);
            i = (i + 1) % capacity;
        }
        return newQueue;
    }


}