public class Main {
    public void rotate() {
        if (size == 0) return;

        T temp = dequeue();
        enqueue(temp);
    }}

//    In this implementation, we first check if there are any elements in the queue. If not,
//    we simply return. Otherwise,
//    we dequeue the first element using its dequeue() method and store it in a temporary variable called temp.
//    We then enqueue this element at the rear end of the queue using its enqueue() method.
//    This implementation is more efficient than creating two separate calls to enqueue() and dequeue(),
//    as it only requires one call to each method. Additionally,
//    since we are using a circular array to implement the queue,
//    both operations have constant time complexity O(1).}