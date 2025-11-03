import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                System.out.println("item is present " + i + " index");
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("item is not present");
        }
    }
}
