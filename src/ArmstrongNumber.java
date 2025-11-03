import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = 0;
        int t = a;
        while (t != 0) {
            t = t / 10;
            temp = temp + 1;
        }
        int rem;
        int t2 = a;
        int arm = 0;
        while (t2 != 0) {
            rem = t2 % 10;
            int mul = 1;
            for (int i = 1; i <= temp; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            t2 = t2 / 10;
        }
        if (arm ==a) {
            System.out.println(arm + " is armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
