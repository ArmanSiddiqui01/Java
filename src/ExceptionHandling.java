import java.util.Scanner;
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String s){
        super(s);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age< 18) {
                throw new YoungerAgeException("hello");
            } else {
                System.out.println("eligible");
            }
        } catch (YoungerAgeException e) {
            System.out.println(e);
        }
    }
}
