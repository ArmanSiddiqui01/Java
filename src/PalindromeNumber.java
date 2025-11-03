import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int k=a;
        int rev=0,c;
        while(k!=0){
            c=k%10;
            rev=rev*10+c;
            k=k/10;
        }
        if(a==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
