import java.util.LinkedList;
import java.util.Queue;

public class Main {
        public static void main(String[] args) {
            int[] arrivalTimes = {0, 1, 2, 3}; // example arrival times
            int[] burstTimes = {5, 3, 8, 6}; // example burst times
            int quantum = 2; // example time slice

            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < arrivalTimes.length; i++) {
                queue.add(i);
            }

            int currentTime = 0;
            while (!queue.isEmpty()) {
                int currentProcess = queue.remove();
                if (burstTimes[currentProcess] > quantum) {
                    burstTimes[currentProcess] -= quantum;
                    currentTime += quantum;
                    queue.add(currentProcess);
                } else {
                    currentTime += burstTimes[currentProcess];
                    System.out.println("Process " + currentProcess + " finished at time " + currentTime);
                }
            }
        }
    }