import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our calculator");
        System.out.println("please enter your first number");
        int a = sc.nextInt();
        System.out.println("please enter your second number");
        int b = sc.nextInt();
        int res;
        System.out.println("please enter valid symbol");
        String sym = sc.next();
        switch (sym) {
            case "+":
                res = a + b;
                System.out.println(res);
                break;
            case "-":
                res = a - b;
                System.out.println(res);
                break;
            case "*":
                res = a * b;
                System.out.println(res);
                break;
            case "/":
                res = a / b;
                System.out.println(res);
                break;
            default:
                System.out.println("enter symbol is invalid");
        }
    }
}
