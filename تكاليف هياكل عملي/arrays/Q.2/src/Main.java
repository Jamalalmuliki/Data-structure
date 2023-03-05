public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = a.clone();

        System.out.println(a == b ? "Same Instance":"Different Instance");
        //Outputs different instance

        System.out.println(a[0]);
        System.out.println(b[2]);
    }
}