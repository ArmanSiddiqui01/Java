import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to our Divide Calculator");
        System.out.println("Enter your first number:");
        int a=sc.nextInt();
        System.out.println("Enter you second number:");
        int b=sc.nextInt();
        System.out.println("The Division of two number is: " +(a/b));
    }
}
