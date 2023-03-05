import java.util.LinkedList;

        import java.util.Queue;

public class Josephus {
    public static void main(String[] args) {
        int m = Integer.parseInt(String.valueOf(args));
        int n = Integer.parseInt(args[1]);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < m - 1; i++) {
                queue.add(queue.remove());
            }
            System.out.print(queue.remove() + " ");
        }
    }
}