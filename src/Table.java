import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 1;
        int b;
        while (i <= 10) {
            b = i * a;
            System.out.println(a + "X" + i + "=" + b);
            i++;
        }
    }
}
