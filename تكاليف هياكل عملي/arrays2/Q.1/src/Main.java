
public class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.print("array1=(");
        for (int j=0;j<originalArray.length;j++){
            System.out.print(originalArray[j]+" ,");
        }
        System.out.print("0) ");

        System.out.println(" ");
        System.out.print("array2=(");
        int[] clonedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            clonedArray[i] = originalArray[i];
            System.out.print(clonedArray[i]+",");
        }
        System.out.print("0) ");
    }
}