import java.util.Scanner;

public class ArrayInput {
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("please enter your array length: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("enter index number");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayInput ai=new ArrayInput();
        ai.input();
    }
}
