import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};

        boolean isEqual1 = Arrays.equals(arr1, arr2);
        boolean isEqual2 = Arrays.equals(arr1, arr3);

        System.out.println("arr1 is equal to arr2: " + isEqual1);
        System.out.println("arr1 is equal to arr3: " + isEqual2);
    }
}