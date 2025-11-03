import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int item = sc.nextInt();
        int li = 0;
        int hi = a.length - 1;
        int mi = (li + hi) / 2;
        while (li <= hi) {
            if (a[mi] == item) {
                System.out.println("item is present ");
                break;
            } else if (a[mi] < item) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if (li > hi) { // in this area hi=-1 is there
            System.out.println("item is not present");
        }
    }
}
