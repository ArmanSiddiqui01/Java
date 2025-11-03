import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int rev=0;
        int i;
        while(no>0){
            i=no%10;
            rev=rev*10+i;
            no=no/10;
        }
        System.out.println(rev);
    }
}
