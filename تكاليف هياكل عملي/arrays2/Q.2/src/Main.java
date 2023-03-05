import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass[] arr1 = {new MyClass(1), new MyClass(2), new MyClass(3)};
        MyClass[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }

    }
class MyClass {
    int x;
    public MyClass(int x) {
        this.x = x;
    }
}